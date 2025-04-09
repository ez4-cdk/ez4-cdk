package com.delta.playandroidpro.center.project.bean.entity;

/**
 * 首页最受欢迎板块-路线
 * 体系数据
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0016J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u0014H\u00c6\u0003J\t\u00100\u001a\u00020\tH\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\tH\u00c6\u0003J\t\u00104\u001a\u00020\u0006H\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\tH\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\u00ab\u0001\u00109\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\tH\u00c6\u0001J\u0013\u0010:\u001a\u00020\u00142\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\tH\u00d6\u0001J\t\u0010=\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u0015\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001d\u00a8\u0006>"}, d2 = {"Lcom/delta/playandroidpro/center/project/bean/entity/Column;", "", "articleList", "", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "author", "", "children", "courseId", "", "cover", "desc", "id", "lisense", "lisenseLink", "name", "order", "parentChapterId", "type", "userControlSetTop", "", "visible", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZI)V", "getArticleList", "()Ljava/util/List;", "getAuthor", "()Ljava/lang/String;", "getChildren", "getCourseId", "()I", "getCover", "getDesc", "getId", "getLisense", "getLisenseLink", "getName", "getOrder", "getParentChapterId", "getType", "getUserControlSetTop", "()Z", "getVisible", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"})
public final class Column {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article> articleList = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String author = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.delta.playandroidpro.center.project.bean.entity.Column> children = null;
    private final int courseId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String cover = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String desc = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lisense = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lisenseLink = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    private final int order = 0;
    private final int parentChapterId = 0;
    private final int type = 0;
    private final boolean userControlSetTop = false;
    private final int visible = 0;
    
    public Column(@org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article> articleList, @org.jetbrains.annotations.NotNull
    java.lang.String author, @org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.project.bean.entity.Column> children, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String cover, @org.jetbrains.annotations.NotNull
    java.lang.String desc, int id, @org.jetbrains.annotations.NotNull
    java.lang.String lisense, @org.jetbrains.annotations.NotNull
    java.lang.String lisenseLink, @org.jetbrains.annotations.NotNull
    java.lang.String name, int order, int parentChapterId, int type, boolean userControlSetTop, int visible) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article> getArticleList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.delta.playandroidpro.center.project.bean.entity.Column> getChildren() {
        return null;
    }
    
    public final int getCourseId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCover() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDesc() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLisense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLisenseLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getOrder() {
        return 0;
    }
    
    public final int getParentChapterId() {
        return 0;
    }
    
    public final int getType() {
        return 0;
    }
    
    public final boolean getUserControlSetTop() {
        return false;
    }
    
    public final int getVisible() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.delta.playandroidpro.center.project.bean.entity.Column> component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroidpro.center.project.bean.entity.Column copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Article> articleList, @org.jetbrains.annotations.NotNull
    java.lang.String author, @org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.project.bean.entity.Column> children, int courseId, @org.jetbrains.annotations.NotNull
    java.lang.String cover, @org.jetbrains.annotations.NotNull
    java.lang.String desc, int id, @org.jetbrains.annotations.NotNull
    java.lang.String lisense, @org.jetbrains.annotations.NotNull
    java.lang.String lisenseLink, @org.jetbrains.annotations.NotNull
    java.lang.String name, int order, int parentChapterId, int type, boolean userControlSetTop, int visible) {
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