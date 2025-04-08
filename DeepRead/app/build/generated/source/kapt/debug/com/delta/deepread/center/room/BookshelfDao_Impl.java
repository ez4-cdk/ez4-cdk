package com.delta.deepread.center.room;

import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.delta.deepread.center.read.bookshelf.data.Novel;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BookshelfDao_Impl implements BookshelfDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Novel> __insertionAdapterOfNovel;

  private final TypeConverter __typeConverter = new TypeConverter();

  private final EntityDeletionOrUpdateAdapter<Novel> __deletionAdapterOfNovel;

  private final EntityDeletionOrUpdateAdapter<Novel> __updateAdapterOfNovel;

  public BookshelfDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNovel = new EntityInsertionAdapter<Novel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `DEFAULT_BOOK` (`id`,`name`,`process`,`uploadTime`,`path`,`uri`,`scrollY`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Novel entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getProcess() == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, entity.getProcess());
        }
        if (entity.getUploadTime() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getUploadTime());
        }
        if (entity.getPath() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getPath());
        }
        final String _tmp = __typeConverter.uriToString(entity.getUri());
        if (_tmp == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp);
        }
        if (entity.getScrollY() == null) {
          statement.bindNull(7);
        } else {
          statement.bindLong(7, entity.getScrollY());
        }
      }
    };
    this.__deletionAdapterOfNovel = new EntityDeletionOrUpdateAdapter<Novel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `DEFAULT_BOOK` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Novel entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
      }
    };
    this.__updateAdapterOfNovel = new EntityDeletionOrUpdateAdapter<Novel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `DEFAULT_BOOK` SET `id` = ?,`name` = ?,`process` = ?,`uploadTime` = ?,`path` = ?,`uri` = ?,`scrollY` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Novel entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getProcess() == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, entity.getProcess());
        }
        if (entity.getUploadTime() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getUploadTime());
        }
        if (entity.getPath() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getPath());
        }
        final String _tmp = __typeConverter.uriToString(entity.getUri());
        if (_tmp == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp);
        }
        if (entity.getScrollY() == null) {
          statement.bindNull(7);
        } else {
          statement.bindLong(7, entity.getScrollY());
        }
        if (entity.getId() == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, entity.getId());
        }
      }
    };
  }

  @Override
  public long insertNovel(final Novel novel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfNovel.insertAndReturnId(novel);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteNovel(final Novel novel) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __deletionAdapterOfNovel.handle(novel);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateNovel(final Novel novel) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __updateAdapterOfNovel.handle(novel);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Novel> getAllNovels() {
    final String _sql = "SELECT * FROM DEFAULT_BOOK";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfProcess = CursorUtil.getColumnIndexOrThrow(_cursor, "process");
      final int _cursorIndexOfUploadTime = CursorUtil.getColumnIndexOrThrow(_cursor, "uploadTime");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
      final int _cursorIndexOfScrollY = CursorUtil.getColumnIndexOrThrow(_cursor, "scrollY");
      final List<Novel> _result = new ArrayList<Novel>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Novel _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final Integer _tmpProcess;
        if (_cursor.isNull(_cursorIndexOfProcess)) {
          _tmpProcess = null;
        } else {
          _tmpProcess = _cursor.getInt(_cursorIndexOfProcess);
        }
        final String _tmpUploadTime;
        if (_cursor.isNull(_cursorIndexOfUploadTime)) {
          _tmpUploadTime = null;
        } else {
          _tmpUploadTime = _cursor.getString(_cursorIndexOfUploadTime);
        }
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final Uri _tmpUri;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfUri)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfUri);
        }
        _tmpUri = __typeConverter.fromUriString(_tmp);
        final Integer _tmpScrollY;
        if (_cursor.isNull(_cursorIndexOfScrollY)) {
          _tmpScrollY = null;
        } else {
          _tmpScrollY = _cursor.getInt(_cursorIndexOfScrollY);
        }
        _item = new Novel(_tmpId,_tmpName,_tmpProcess,_tmpUploadTime,_tmpPath,_tmpUri,_tmpScrollY);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
