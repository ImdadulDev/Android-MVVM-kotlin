package net.rexdev.mvvm.data.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import net.rexdev.mvvm.data.db.entities.Quote;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QuoteDao_Impl implements QuoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Quote> __insertionAdapterOfQuote;

  public QuoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQuote = new EntityInsertionAdapter<Quote>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Quote` (`id`,`quote`,`author`,`thumbnail`,`created_at`,`updated_at`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Quote value) {
        stmt.bindLong(1, value.getId());
        if (value.getQuote() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getQuote());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAuthor());
        }
        if (value.getThumbnail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getThumbnail());
        }
        if (value.getCreated_at() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCreated_at());
        }
        if (value.getUpdated_at() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUpdated_at());
        }
      }
    };
  }

  @Override
  public void saveAllQuotes(final List<Quote> quotes) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfQuote.insert(quotes);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Quote>> getQuotes() {
    final String _sql = "SELECT * FROM Quote";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Quote"}, false, new Callable<List<Quote>>() {
      @Override
      public List<Quote> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfQuote = CursorUtil.getColumnIndexOrThrow(_cursor, "quote");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<Quote> _result = new ArrayList<Quote>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Quote _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpQuote;
            _tmpQuote = _cursor.getString(_cursorIndexOfQuote);
            final String _tmpAuthor;
            _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            final String _tmpThumbnail;
            _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
            final String _tmpCreated_at;
            _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getString(_cursorIndexOfUpdatedAt);
            _item = new Quote(_tmpId,_tmpQuote,_tmpAuthor,_tmpThumbnail,_tmpCreated_at,_tmpUpdated_at);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
