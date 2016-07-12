package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbNewsDao;
import sdkd.com.ec.model.EbNews;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by SDUST-132 on 2016/7/6.
 */
public class EbNewsController extends HttpServlet {
          EbNewsDao newsDao = new EbNewsDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //
        String judge = request.getParameter("judge");


        if("list".equals(judge)){

        }else if("detail".equals(judge)){

            singleNew(request,response);
        }else{
            List(request,response);
        }

        //跳转

    }
    public void List(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<EbNews> list = newsDao.getNews();
        request.setAttribute("newList",list);
        request.getRequestDispatcher("/action1").forward(request,response);
    }
    public void singleNew(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramsId = request.getParameter("id");
        int id = 0;
        if(paramsId!=null && !"".equals(paramsId)){
            id = Integer.valueOf(paramsId);
        }
        EbNews ebNews = newsDao.getNewsById(id);
        request.setAttribute("news",ebNews);
        request.getRequestDispatcher("/news-view.jsp").forward(request,response);
    }
}
