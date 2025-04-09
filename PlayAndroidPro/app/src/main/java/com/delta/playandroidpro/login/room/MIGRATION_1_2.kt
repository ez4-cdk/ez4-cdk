import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import android.util.Base64

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        // 创建临时表
        database.execSQL("""
            CREATE TABLE user_new (
                username TEXT PRIMARY KEY NOT NULL,
                avatar TEXT,
                password TEXT NOT NULL
            )
        """)

        // 将数据从原表迁移到临时表，处理 avatar 列的 NULL 值并转换为 String
        database.execSQL("""
            INSERT INTO user_new (username, avatar, password)
            SELECT username, 
                   CASE 
                       WHEN avatar IS NULL THEN '' 
                       ELSE CAST(? AS TEXT) 
                   END, 
                   password 
            FROM user
        """, arrayOf(Base64.encodeToString(byteArrayOf(), Base64.DEFAULT)))

        // 删除原表
        database.execSQL("DROP TABLE user")

        // 重命名临时表为原表名
        database.execSQL("ALTER TABLE user_new RENAME TO user")
    }
}
