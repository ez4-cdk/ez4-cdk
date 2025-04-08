package com.delta.deepread.center.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/delta/deepread/center/room/TypeConverter;", "", "()V", "dateToTimestamp", "", "date", "Ljava/util/Date;", "(Ljava/util/Date;)Ljava/lang/Long;", "fromTimestamp", "value", "(Ljava/lang/Long;)Ljava/util/Date;", "fromUriString", "Landroid/net/Uri;", "", "uriToString", "uri", "app_release"})
public final class TypeConverter {
    
    public TypeConverter() {
        super();
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.util.Date fromTimestamp(@org.jetbrains.annotations.Nullable
    java.lang.Long value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long dateToTimestamp(@org.jetbrains.annotations.Nullable
    java.util.Date date) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri fromUriString(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.lang.String uriToString(@org.jetbrains.annotations.Nullable
    android.net.Uri uri) {
        return null;
    }
}