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
import com.delta.deepread.center.music.data.Song;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MusicDao_Impl implements MusicDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Song> __insertionAdapterOfSong;

  private final TypeConverter __typeConverter = new TypeConverter();

  private final EntityDeletionOrUpdateAdapter<Song> __deletionAdapterOfSong;

  private final EntityDeletionOrUpdateAdapter<Song> __updateAdapterOfSong;

  public MusicDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSong = new EntityInsertionAdapter<Song>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `DEFAULT_SONG` (`id`,`name`,`path`,`uri`,`duration`,`size`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Song entity) {
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
        if (entity.getPath() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPath());
        }
        final String _tmp = __typeConverter.uriToString(entity.getUri());
        if (_tmp == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp);
        }
        if (entity.getDuration() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getDuration());
        }
        if (entity.getSize() == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, entity.getSize());
        }
      }
    };
    this.__deletionAdapterOfSong = new EntityDeletionOrUpdateAdapter<Song>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `DEFAULT_SONG` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Song entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
      }
    };
    this.__updateAdapterOfSong = new EntityDeletionOrUpdateAdapter<Song>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `DEFAULT_SONG` SET `id` = ?,`name` = ?,`path` = ?,`uri` = ?,`duration` = ?,`size` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Song entity) {
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
        if (entity.getPath() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPath());
        }
        final String _tmp = __typeConverter.uriToString(entity.getUri());
        if (_tmp == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp);
        }
        if (entity.getDuration() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getDuration());
        }
        if (entity.getSize() == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, entity.getSize());
        }
        if (entity.getId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindLong(7, entity.getId());
        }
      }
    };
  }

  @Override
  public long insertSong(final Song song) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfSong.insertAndReturnId(song);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteSong(final Song song) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __deletionAdapterOfSong.handle(song);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateSong(final Song song) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __updateAdapterOfSong.handle(song);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Song> getAllSongs() {
    final String _sql = "SELECT * FROM DEFAULT_SONG";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
      final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Song _item;
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
        final Long _tmpDuration;
        if (_cursor.isNull(_cursorIndexOfDuration)) {
          _tmpDuration = null;
        } else {
          _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
        }
        final Long _tmpSize;
        if (_cursor.isNull(_cursorIndexOfSize)) {
          _tmpSize = null;
        } else {
          _tmpSize = _cursor.getLong(_cursorIndexOfSize);
        }
        _item = new Song(_tmpId,_tmpName,_tmpPath,_tmpUri,_tmpDuration,_tmpSize);
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
