package com.delta.playandroidpro.center.home.bean.entity;

/**
 * @description 文章实体
 * @author delta
 * @date 2025/2/8 16:54
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b^\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0082\u0001B\u00f5\u0002\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\b\b\u0002\u0010\'\u001a\u00020\u0007\u0012\b\b\u0002\u0010(\u001a\u00020\u0007\u0012\b\b\u0002\u0010)\u001a\u00020\u0007\u0012\b\b\u0002\u0010*\u001a\u00020\u0007\u0012\b\b\u0002\u0010+\u001a\u00020\u0007\u00a2\u0006\u0002\u0010,J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010[\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0005H\u00c6\u0003J\t\u0010]\u001a\u00020\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0007H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010g\u001a\u00020\u0005H\u00c6\u0003J\t\u0010h\u001a\u00020\u001cH\u00c6\u0003J\t\u0010i\u001a\u00020\u0007H\u00c6\u0003J\t\u0010j\u001a\u00020\u0007H\u00c6\u0003J\t\u0010k\u001a\u00020\u001cH\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0007H\u00c6\u0003J\t\u0010n\u001a\u00020\u0005H\u00c6\u0003J\t\u0010o\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010p\u001a\b\u0012\u0004\u0012\u00020%0$H\u00c6\u0003J\t\u0010q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010r\u001a\u00020\u0007H\u00c6\u0003J\t\u0010s\u001a\u00020\u0007H\u00c6\u0003J\t\u0010t\u001a\u00020\u0007H\u00c6\u0003J\t\u0010u\u001a\u00020\u0007H\u00c6\u0003J\t\u0010v\u001a\u00020\u0007H\u00c6\u0003J\t\u0010w\u001a\u00020\u0005H\u00c6\u0003J\t\u0010x\u001a\u00020\u0003H\u00c6\u0003J\t\u0010y\u001a\u00020\u0007H\u00c6\u0003J\t\u0010z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\u0007H\u00c6\u0003J\u00f7\u0002\u0010}\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010\'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010~\u001a\u00020\u00032\b\u0010\u007f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0007H\u00d6\u0001J\n\u0010\u0081\u0001\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00105R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00100R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010.R\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u00100\"\u0004\bB\u00105R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00100R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00100R\u0011\u0010+\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0011\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00100R\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00100R\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\u001d\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00102R\u0011\u0010\u001e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0011\u0010\u001f\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010JR\u0011\u0010 \u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00100R\u0011\u0010!\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0011\u0010\"\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00100R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u001a\u0010&\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u00100\"\u0004\bT\u00105R\u0011\u0010\'\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00102R\u0011\u0010(\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00102R\u0011\u0010)\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00102R\u0011\u0010*\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00102\u00a8\u0006\u0083\u0001"}, d2 = {"Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "", "adminAdd", "", "apkLink", "", "audit", "", "author", "canEdit", "chapterId", "chapterName", "collect", "courseId", "desc", "descMd", "envelopePic", "fresh", "host", "id", "isAdminAdd", "link", "niceDate", "niceShareDate", "origin", "prefix", "projectLink", "publishTime", "", "realSuperChapterId", "selfVisible", "shareDate", "shareUser", "superChapterId", "superChapterName", "tags", "", "Lcom/delta/playandroidpro/center/home/bean/entity/Article$Tag;", "title", "type", "userId", "visible", "zan", "originId", "(ZLjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIJLjava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;IIIII)V", "getAdminAdd", "()Z", "getApkLink", "()Ljava/lang/String;", "getAudit", "()I", "getAuthor", "setAuthor", "(Ljava/lang/String;)V", "getCanEdit", "getChapterId", "getChapterName", "getCollect", "getCourseId", "getDesc", "getDescMd", "getEnvelopePic", "getFresh", "getHost", "getId", "getLink", "setLink", "getNiceDate", "getNiceShareDate", "getOrigin", "getOriginId", "getPrefix", "getProjectLink", "getPublishTime", "()J", "getRealSuperChapterId", "getSelfVisible", "getShareDate", "getShareUser", "getSuperChapterId", "getSuperChapterName", "getTags", "()Ljava/util/List;", "getTitle", "setTitle", "getType", "getUserId", "getVisible", "getZan", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Tag", "app_release"})
public final class Article {
    private final boolean adminAdd = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String apkLink = null;
    private final int audit = 0;
    @org.jetbrains.annotations.NotNull
    private java.lang.String author;
    private final boolean canEdit = false;
    private final int chapterId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String chapterName = null;
    private final boolean collect = false;
    private final int courseId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String desc = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String descMd = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String envelopePic = null;
    private final boolean fresh = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String host = null;
    private final int id = 0;
    private final boolean isAdminAdd = false;
    @org.jetbrains.annotations.NotNull
    private java.lang.String link;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String niceDate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String niceShareDate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String origin = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String prefix = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String projectLink = null;
    private final long publishTime = 0L;
    private final int realSuperChapterId = 0;
    private final int selfVisible = 0;
    private final long shareDate = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shareUser = null;
    private final int superChapterId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String superChapterName = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> tags = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title;
    private final int type = 0;
    private final int userId = 0;
    private final int visible = 0;
    private final int zan = 0;
    private final int originId = 0;
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull
    java.lang.String superChapterName, @org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> tags, @org.jetbrains.annotations.NotNull
    java.lang.String title, int type, int userId, int visible, int zan, int originId) {
        super();
    }
    
    public final boolean getAdminAdd() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getApkLink() {
        return null;
    }
    
    public final int getAudit() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAuthor() {
        return null;
    }
    
    public final void setAuthor(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getCanEdit() {
        return false;
    }
    
    public final int getChapterId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChapterName() {
        return null;
    }
    
    public final boolean getCollect() {
        return false;
    }
    
    public final int getCourseId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDesc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescMd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEnvelopePic() {
        return null;
    }
    
    public final boolean getFresh() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHost() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean isAdminAdd() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLink() {
        return null;
    }
    
    public final void setLink(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNiceDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNiceShareDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrigin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProjectLink() {
        return null;
    }
    
    public final long getPublishTime() {
        return 0L;
    }
    
    public final int getRealSuperChapterId() {
        return 0;
    }
    
    public final int getSelfVisible() {
        return 0;
    }
    
    public final long getShareDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShareUser() {
        return null;
    }
    
    public final int getSuperChapterId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSuperChapterName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getType() {
        return 0;
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final int getVisible() {
        return 0;
    }
    
    public final int getZan() {
        return 0;
    }
    
    public final int getOriginId() {
        return 0;
    }
    
    @kotlin.jvm.JvmOverloads
    public Article() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser, int superChapterId) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull
    java.lang.String superChapterName) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull
    java.lang.String superChapterName, @org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> tags) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull
    java.lang.String superChapterName, @org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> tags, @org.jetbrains.annotations.NotNull
    java.lang.String title) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull
    java.lang.String superChapterName, @org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> tags, @org.jetbrains.annotations.NotNull
    java.lang.String title, int type) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull
    java.lang.String superChapterName, @org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> tags, @org.jetbrains.annotations.NotNull
    java.lang.String title, int type, int userId) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull
    java.lang.String superChapterName, @org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> tags, @org.jetbrains.annotations.NotNull
    java.lang.String title, int type, int userId, int visible) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Article(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull
    java.lang.String superChapterName, @org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> tags, @org.jetbrains.annotations.NotNull
    java.lang.String title, int type, int userId, int visible, int zan) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final boolean component16() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component22() {
        return null;
    }
    
    public final long component23() {
        return 0L;
    }
    
    public final int component24() {
        return 0;
    }
    
    public final int component25() {
        return 0;
    }
    
    public final long component26() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component27() {
        return null;
    }
    
    public final int component28() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component29() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component31() {
        return null;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final int component33() {
        return 0;
    }
    
    public final int component34() {
        return 0;
    }
    
    public final int component35() {
        return 0;
    }
    
    public final int component36() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroidpro.center.home.bean.entity.Article copy(boolean adminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String desc, @org.jetbrains.annotations.NotNull
    java.lang.String descMd, @org.jetbrains.annotations.NotNull
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull
    java.lang.String host, int id, boolean isAdminAdd, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull
    java.lang.String superChapterName, @org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article.Tag> tags, @org.jetbrains.annotations.NotNull
    java.lang.String title, int type, int userId, int visible, int zan, int originId) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/delta/playandroidpro/center/home/bean/entity/Article$Tag;", "", "name", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
    public static final class Tag {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String url = null;
        
        public Tag(@org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String url) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.delta.playandroidpro.center.home.bean.entity.Article.Tag copy(@org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String url) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}