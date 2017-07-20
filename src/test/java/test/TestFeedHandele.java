package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.erp.Applaction;
import com.erp.biz.api.handle.FeedHandele;
import com.erp.db.service.IUserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes ={ Applaction.class})
public class TestFeedHandele
{
    @Resource
    private FeedHandele task;
    @Resource
    private IUserInfoService userInfoService;
    @Test
    public void test()
    {
        
        try
        {
            Integer id=1;
            task.getFeedsv3(null, userInfoService.queryById(id));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
