package com.delta.deepread.center.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DefaultDatabase_Impl extends DefaultDatabase {
  private volatile BookshelfDao _bookshelfDao;

  private volatile MusicDao _musicDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `DEFAULT_BOOK` (`id` INTEGER, `name` TEXT, `process` INTEGER, `uploadTime` TEXT, `path` TEXT, `uri` TEXT, `scrollY` INTEGER, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `DEFAULT_SONG` (`id` INTEGER, `name` TEXT, `path` TEXT, `uri` TEXT, `duration` INTEGER, `size` INTEGER, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '18b553f94b0fcee98fdbca3514c29aa5')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `DEFAULT_BOOK`");
        db.execSQL("DROP TABLE IF EXISTS `DEFAULT_SONG`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsDEFAULTBOOK = new HashMap<String, TableInfo.Column>(7);
        _columnsDEFAULTBOOK.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTBOOK.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTBOOK.put("process", new TableInfo.Column("process", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTBOOK.put("uploadTime", new TableInfo.Column("uploadTime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTBOOK.put("path", new TableInfo.Column("path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTBOOK.put("uri", new TableInfo.Column("uri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTBOOK.put("scrollY", new TableInfo.Column("scrollY", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDEFAULTBOOK = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDEFAULTBOOK = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDEFAULTBOOK = new TableInfo("DEFAULT_BOOK", _columnsDEFAULTBOOK, _foreignKeysDEFAULTBOOK, _indicesDEFAULTBOOK);
        final TableInfo _existingDEFAULTBOOK = TableInfo.read(db, "DEFAULT_BOOK");
        if (!_infoDEFAULTBOOK.equals(_existingDEFAULTBOOK)) {
          return new RoomOpenHelper.ValidationResult(false, "DEFAULT_BOOK(com.delta.deepread.center.read.bookshelf.data.Novel).\n"
                  + " Expected:\n" + _infoDEFAULTBOOK + "\n"
                  + " Found:\n" + _existingDEFAULTBOOK);
        }
        final HashMap<String, TableInfo.Column> _columnsDEFAULTSONG = new HashMap<String, TableInfo.Column>(6);
        _columnsDEFAULTSONG.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTSONG.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTSONG.put("path", new TableInfo.Column("path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTSONG.put("uri", new TableInfo.Column("uri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTSONG.put("duration", new TableInfo.Column("duration", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDEFAULTSONG.put("size", new TableInfo.Column("size", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDEFAULTSONG = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDEFAULTSONG = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDEFAULTSONG = new TableInfo("DEFAULT_SONG", _columnsDEFAULTSONG, _foreignKeysDEFAULTSONG, _indicesDEFAULTSONG);
        final TableInfo _existingDEFAULTSONG = TableInfo.read(db, "DEFAULT_SONG");
        if (!_infoDEFAULTSONG.equals(_existingDEFAULTSONG)) {
          return new RoomOpenHelper.ValidationResult(false, "DEFAULT_SONG(com.delta.deepread.center.music.data.Song).\n"
                  + " Expected:\n" + _infoDEFAULTSONG + "\n"
                  + " Found:\n" + _existingDEFAULTSONG);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "18b553f94b0fcee98fdbca3514c29aa5", "5735a09a60ddb66a99c09549c8b4a124");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "DEFAULT_BOOK","DEFAULT_SONG");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `DEFAULT_BOOK`");
      _db.execSQL("DELETE FROM `DEFAULT_SONG`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(BookshelfDao.class, BookshelfDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MusicDao.class, MusicDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public BookshelfDao bookstoreDao() {
    if (_bookshelfDao != null) {
      return _bookshelfDao;
    } else {
      synchronized(this) {
        if(_bookshelfDao == null) {
          _bookshelfDao = new BookshelfDao_Impl(this);
        }
        return _bookshelfDao;
      }
    }
  }

  @Override
  public MusicDao musicDao() {
    if (_musicDao != null) {
      return _musicDao;
    } else {
      synchronized(this) {
        if(_musicDao == null) {
          _musicDao = new MusicDao_Impl(this);
        }
        return _musicDao;
      }
    }
  }
}
