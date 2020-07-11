package springboot.demo.mapper;

import org.apache.ibatis.annotations.Param;
import springboot.demo.POJO.pageVO;
import springboot.demo.POJO.sbinfoPOJO;
import springboot.demo.POJO.sblx;

import java.util.Date;
import java.util.List;

/**
 * @author wei
 * @date 2020/7/6 0006 -  21:03
 */

public interface sbinfo {
    sbinfoPOJO find(String sbmc);

    Integer selectCount();

    List<sbinfoPOJO> getPageData(
            @Param("index") Integer index,
            @Param("last")  Integer last
    );

    Integer del(Integer [] ids);

    List<sbinfoPOJO> getPageDataWhere(
            @Param("index") Integer index,
            @Param("last")  Integer last,
            @Param("sbmc") String sbmc,
            @Param("sblxmc")  String sblxmc,
            @Param("sbscrq") Date sbscrq,
            @Param("sbjg")  Double sbjg
    );
    Integer insertsbinfo(sbinfoPOJO pojo);

    Integer insertsblx(sblx lx);

    Integer updatesbinfo(sbinfoPOJO pojo);
}
