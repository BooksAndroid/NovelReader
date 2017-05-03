package com.example.newbiechen.ireader.model.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.newbiechen.ireader.model.bean.BookHelpfulBean;
import com.example.newbiechen.ireader.model.bean.BookReviewBean;
import com.example.newbiechen.ireader.model.bean.BookBean;
import com.example.newbiechen.ireader.model.bean.AuthorBean;
import com.example.newbiechen.ireader.model.bean.BookHelpsBean;
import com.example.newbiechen.ireader.model.bean.BookCommentBean;

import com.example.newbiechen.ireader.model.gen.BookHelpfulBeanDao;
import com.example.newbiechen.ireader.model.gen.BookReviewBeanDao;
import com.example.newbiechen.ireader.model.gen.BookBeanDao;
import com.example.newbiechen.ireader.model.gen.AuthorBeanDao;
import com.example.newbiechen.ireader.model.gen.BookHelpsBeanDao;
import com.example.newbiechen.ireader.model.gen.BookCommentBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bookHelpfulBeanDaoConfig;
    private final DaoConfig bookReviewBeanDaoConfig;
    private final DaoConfig bookBeanDaoConfig;
    private final DaoConfig authorBeanDaoConfig;
    private final DaoConfig bookHelpsBeanDaoConfig;
    private final DaoConfig bookCommentBeanDaoConfig;

    private final BookHelpfulBeanDao bookHelpfulBeanDao;
    private final BookReviewBeanDao bookReviewBeanDao;
    private final BookBeanDao bookBeanDao;
    private final AuthorBeanDao authorBeanDao;
    private final BookHelpsBeanDao bookHelpsBeanDao;
    private final BookCommentBeanDao bookCommentBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bookHelpfulBeanDaoConfig = daoConfigMap.get(BookHelpfulBeanDao.class).clone();
        bookHelpfulBeanDaoConfig.initIdentityScope(type);

        bookReviewBeanDaoConfig = daoConfigMap.get(BookReviewBeanDao.class).clone();
        bookReviewBeanDaoConfig.initIdentityScope(type);

        bookBeanDaoConfig = daoConfigMap.get(BookBeanDao.class).clone();
        bookBeanDaoConfig.initIdentityScope(type);

        authorBeanDaoConfig = daoConfigMap.get(AuthorBeanDao.class).clone();
        authorBeanDaoConfig.initIdentityScope(type);

        bookHelpsBeanDaoConfig = daoConfigMap.get(BookHelpsBeanDao.class).clone();
        bookHelpsBeanDaoConfig.initIdentityScope(type);

        bookCommentBeanDaoConfig = daoConfigMap.get(BookCommentBeanDao.class).clone();
        bookCommentBeanDaoConfig.initIdentityScope(type);

        bookHelpfulBeanDao = new BookHelpfulBeanDao(bookHelpfulBeanDaoConfig, this);
        bookReviewBeanDao = new BookReviewBeanDao(bookReviewBeanDaoConfig, this);
        bookBeanDao = new BookBeanDao(bookBeanDaoConfig, this);
        authorBeanDao = new AuthorBeanDao(authorBeanDaoConfig, this);
        bookHelpsBeanDao = new BookHelpsBeanDao(bookHelpsBeanDaoConfig, this);
        bookCommentBeanDao = new BookCommentBeanDao(bookCommentBeanDaoConfig, this);

        registerDao(BookHelpfulBean.class, bookHelpfulBeanDao);
        registerDao(BookReviewBean.class, bookReviewBeanDao);
        registerDao(BookBean.class, bookBeanDao);
        registerDao(AuthorBean.class, authorBeanDao);
        registerDao(BookHelpsBean.class, bookHelpsBeanDao);
        registerDao(BookCommentBean.class, bookCommentBeanDao);
    }
    
    public void clear() {
        bookHelpfulBeanDaoConfig.clearIdentityScope();
        bookReviewBeanDaoConfig.clearIdentityScope();
        bookBeanDaoConfig.clearIdentityScope();
        authorBeanDaoConfig.clearIdentityScope();
        bookHelpsBeanDaoConfig.clearIdentityScope();
        bookCommentBeanDaoConfig.clearIdentityScope();
    }

    public BookHelpfulBeanDao getBookHelpfulBeanDao() {
        return bookHelpfulBeanDao;
    }

    public BookReviewBeanDao getBookReviewBeanDao() {
        return bookReviewBeanDao;
    }

    public BookBeanDao getBookBeanDao() {
        return bookBeanDao;
    }

    public AuthorBeanDao getAuthorBeanDao() {
        return authorBeanDao;
    }

    public BookHelpsBeanDao getBookHelpsBeanDao() {
        return bookHelpsBeanDao;
    }

    public BookCommentBeanDao getBookCommentBeanDao() {
        return bookCommentBeanDao;
    }

}