package com.delta.playandroid;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.delta.playandroid.databinding.AddCollectWebBindingImpl;
import com.delta.playandroid.databinding.ArticleItemBindingImpl;
import com.delta.playandroid.databinding.BannerAndRvBindingImpl;
import com.delta.playandroid.databinding.CollectRootBindingImpl;
import com.delta.playandroid.databinding.DirRvBindingImpl;
import com.delta.playandroid.databinding.EditCollectArticleBindingImpl;
import com.delta.playandroid.databinding.FastLoginBindingImpl;
import com.delta.playandroid.databinding.FooterItemBindingImpl;
import com.delta.playandroid.databinding.HomeRootBindingImpl;
import com.delta.playandroid.databinding.LoginBindingImpl;
import com.delta.playandroid.databinding.MyInfoBindingImpl;
import com.delta.playandroid.databinding.ProjectItemBindingImpl;
import com.delta.playandroid.databinding.RvPageBindingImpl;
import com.delta.playandroid.databinding.SearchRootBindingImpl;
import com.delta.playandroid.databinding.SearchSearchingBindingImpl;
import com.delta.playandroid.databinding.SignupBindingImpl;
import com.delta.playandroid.databinding.TabAndViewpagerBindingImpl;
import com.delta.playandroid.databinding.WebsiteItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ADDCOLLECTWEB = 1;

  private static final int LAYOUT_ARTICLEITEM = 2;

  private static final int LAYOUT_BANNERANDRV = 3;

  private static final int LAYOUT_COLLECTROOT = 4;

  private static final int LAYOUT_DIRRV = 5;

  private static final int LAYOUT_EDITCOLLECTARTICLE = 6;

  private static final int LAYOUT_FASTLOGIN = 7;

  private static final int LAYOUT_FOOTERITEM = 8;

  private static final int LAYOUT_HOMEROOT = 9;

  private static final int LAYOUT_LOGIN = 10;

  private static final int LAYOUT_MYINFO = 11;

  private static final int LAYOUT_PROJECTITEM = 12;

  private static final int LAYOUT_RVPAGE = 13;

  private static final int LAYOUT_SEARCHROOT = 14;

  private static final int LAYOUT_SEARCHSEARCHING = 15;

  private static final int LAYOUT_SIGNUP = 16;

  private static final int LAYOUT_TABANDVIEWPAGER = 17;

  private static final int LAYOUT_WEBSITEITEM = 18;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(18);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.add_collect_web, LAYOUT_ADDCOLLECTWEB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.article_item, LAYOUT_ARTICLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.banner_and_rv, LAYOUT_BANNERANDRV);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.collect_root, LAYOUT_COLLECTROOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.dir_rv, LAYOUT_DIRRV);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.edit_collect_article, LAYOUT_EDITCOLLECTARTICLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.fast_login, LAYOUT_FASTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.footer_item, LAYOUT_FOOTERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.home_root, LAYOUT_HOMEROOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.login, LAYOUT_LOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.my_info, LAYOUT_MYINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.project_item, LAYOUT_PROJECTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.rv_page, LAYOUT_RVPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.search_root, LAYOUT_SEARCHROOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.search_searching, LAYOUT_SEARCHSEARCHING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.signup, LAYOUT_SIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.tab_and_viewpager, LAYOUT_TABANDVIEWPAGER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.delta.playandroid.R.layout.website_item, LAYOUT_WEBSITEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ADDCOLLECTWEB: {
          if ("layout/add_collect_web_0".equals(tag)) {
            return new AddCollectWebBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_collect_web is invalid. Received: " + tag);
        }
        case  LAYOUT_ARTICLEITEM: {
          if ("layout/article_item_0".equals(tag)) {
            return new ArticleItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for article_item is invalid. Received: " + tag);
        }
        case  LAYOUT_BANNERANDRV: {
          if ("layout/banner_and_rv_0".equals(tag)) {
            return new BannerAndRvBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for banner_and_rv is invalid. Received: " + tag);
        }
        case  LAYOUT_COLLECTROOT: {
          if ("layout/collect_root_0".equals(tag)) {
            return new CollectRootBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for collect_root is invalid. Received: " + tag);
        }
        case  LAYOUT_DIRRV: {
          if ("layout/dir_rv_0".equals(tag)) {
            return new DirRvBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dir_rv is invalid. Received: " + tag);
        }
        case  LAYOUT_EDITCOLLECTARTICLE: {
          if ("layout/edit_collect_article_0".equals(tag)) {
            return new EditCollectArticleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for edit_collect_article is invalid. Received: " + tag);
        }
        case  LAYOUT_FASTLOGIN: {
          if ("layout/fast_login_0".equals(tag)) {
            return new FastLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fast_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FOOTERITEM: {
          if ("layout/footer_item_0".equals(tag)) {
            return new FooterItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for footer_item is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEROOT: {
          if ("layout/home_root_0".equals(tag)) {
            return new HomeRootBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_root is invalid. Received: " + tag);
        }
        case  LAYOUT_LOGIN: {
          if ("layout/login_0".equals(tag)) {
            return new LoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for login is invalid. Received: " + tag);
        }
        case  LAYOUT_MYINFO: {
          if ("layout/my_info_0".equals(tag)) {
            return new MyInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for my_info is invalid. Received: " + tag);
        }
        case  LAYOUT_PROJECTITEM: {
          if ("layout/project_item_0".equals(tag)) {
            return new ProjectItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for project_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RVPAGE: {
          if ("layout/rv_page_0".equals(tag)) {
            return new RvPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rv_page is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHROOT: {
          if ("layout/search_root_0".equals(tag)) {
            return new SearchRootBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_root is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHSEARCHING: {
          if ("layout/search_searching_0".equals(tag)) {
            return new SearchSearchingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_searching is invalid. Received: " + tag);
        }
        case  LAYOUT_SIGNUP: {
          if ("layout/signup_0".equals(tag)) {
            return new SignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for signup is invalid. Received: " + tag);
        }
        case  LAYOUT_TABANDVIEWPAGER: {
          if ("layout/tab_and_viewpager_0".equals(tag)) {
            return new TabAndViewpagerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tab_and_viewpager is invalid. Received: " + tag);
        }
        case  LAYOUT_WEBSITEITEM: {
          if ("layout/website_item_0".equals(tag)) {
            return new WebsiteItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for website_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(13);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "article");
      sKeys.put(2, "articleVM");
      sKeys.put(3, "articleVM2");
      sKeys.put(4, "articleVM3");
      sKeys.put(5, "articleViewModel");
      sKeys.put(6, "bannerViewModel");
      sKeys.put(7, "cardsItemViewModel");
      sKeys.put(8, "fastLoginViewModel");
      sKeys.put(9, "loginViewModel");
      sKeys.put(10, "searchViewModel");
      sKeys.put(11, "signUpViewModel");
      sKeys.put(12, "treePageViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(18);

    static {
      sKeys.put("layout/add_collect_web_0", com.delta.playandroid.R.layout.add_collect_web);
      sKeys.put("layout/article_item_0", com.delta.playandroid.R.layout.article_item);
      sKeys.put("layout/banner_and_rv_0", com.delta.playandroid.R.layout.banner_and_rv);
      sKeys.put("layout/collect_root_0", com.delta.playandroid.R.layout.collect_root);
      sKeys.put("layout/dir_rv_0", com.delta.playandroid.R.layout.dir_rv);
      sKeys.put("layout/edit_collect_article_0", com.delta.playandroid.R.layout.edit_collect_article);
      sKeys.put("layout/fast_login_0", com.delta.playandroid.R.layout.fast_login);
      sKeys.put("layout/footer_item_0", com.delta.playandroid.R.layout.footer_item);
      sKeys.put("layout/home_root_0", com.delta.playandroid.R.layout.home_root);
      sKeys.put("layout/login_0", com.delta.playandroid.R.layout.login);
      sKeys.put("layout/my_info_0", com.delta.playandroid.R.layout.my_info);
      sKeys.put("layout/project_item_0", com.delta.playandroid.R.layout.project_item);
      sKeys.put("layout/rv_page_0", com.delta.playandroid.R.layout.rv_page);
      sKeys.put("layout/search_root_0", com.delta.playandroid.R.layout.search_root);
      sKeys.put("layout/search_searching_0", com.delta.playandroid.R.layout.search_searching);
      sKeys.put("layout/signup_0", com.delta.playandroid.R.layout.signup);
      sKeys.put("layout/tab_and_viewpager_0", com.delta.playandroid.R.layout.tab_and_viewpager);
      sKeys.put("layout/website_item_0", com.delta.playandroid.R.layout.website_item);
    }
  }
}
