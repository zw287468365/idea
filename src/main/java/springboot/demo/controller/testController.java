package springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.demo.POJO.pageVO;
import springboot.demo.POJO.sbinfoPOJO;
import springboot.demo.mapper.sbinfo;

import java.util.Date;
import java.util.List;

/**
 * @author wei
 * @date 2020/7/6 0006 -  21:05
 */
@RestController
@RequestMapping("/sbinfo")
public class testController {
    private static Integer pagesize=2;
    @Autowired
    sbinfo info;
    //http://localhost:8080/sbinfo/select?pageCurrent=1   //分页查全部
    //http://localhost:8080/sbinfo/del?ids=1&ids=2&ids=3   //删除
    //http://localhost:8080/sbinfo/selectWhere?pageCurrent=1&sbmc=1  //条件查询 名称==1
    //http://localhost:8080/sbinfo/selectWhere?pageCurrent=1&sbjg=1200  //小于1200

    //http://localhost:8080/sbinfo/insert?sbmc=5&sblxid=5&sbjg=55555  //c插入
    //http://localhost:8080/sbinfo/update?id=1&sbmc=2&sblxid=2&sbjg=2222
   //http://localhost:8080/sbinfo/insert?sbmc=6&sblxid=5&sbjg=55555 判断是否存在
    @RequestMapping("/select")
    public pageVO<sbinfoPOJO> find(Integer pageCurrent){
        Integer count =info.selectCount();
        Integer index = (pageCurrent-1)*pagesize;
        List<sbinfoPOJO> result = info.getPageData(index,pagesize);
        pageVO vo=new pageVO();
        vo.setRowCount(count);
        vo.setPageCount((count-1)/pagesize+1);
        vo.setPageCurrent(pageCurrent);
        vo.setPageSize(pagesize);
        vo.setData(result);
        return vo;
    }

    @RequestMapping("selectWhere")
    public pageVO<sbinfoPOJO> findWhere(Integer pageCurrent
    ,String sbmc, String sblxmc,Date sbscrq,Double sbjg){
        Integer count =info.selectCount();
        Integer index = (pageCurrent-1)*pagesize;
        List<sbinfoPOJO> result = info.getPageDataWhere(index,pagesize,sbmc,sblxmc,sbscrq,sbjg);
        pageVO vo=new pageVO();
        vo.setRowCount(count);
        vo.setPageCount((count-1)/pagesize+1);
        vo.setPageCurrent(pageCurrent);
        vo.setPageSize(pagesize);
        vo.setData(result);
        return vo;
    }

    @RequestMapping("del")
    public void del(Integer [] ids){
       info.del(ids);
    }

    @RequestMapping("insert")
    public String insertsbinfo(sbinfoPOJO pojo){
        sbinfoPOJO pojo1=info.find(pojo.getSbmc());
        if(pojo1!=null){
            if(pojo.getSbmc().equals(pojo1.getSbmc())){
               return "已经存在";
            }
        }
        Integer id=info.insertsbinfo(pojo);
        return "成功";
    }

    @RequestMapping("update")
    public void updatesbinfo(sbinfoPOJO pojo){
        info.updatesbinfo(pojo);
        //info.insertsblx(new sblx(id,pojo.getSbl().getSblxmc()));
    }
}
