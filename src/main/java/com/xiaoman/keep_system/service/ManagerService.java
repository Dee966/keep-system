package com.xiaoman.keep_system.service;

import com.xiaoman.keep_system.dao.ManagerDao;
import com.xiaoman.keep_system.pojo.po.Manager;
import com.xiaoman.keep_system.pojo.po.Share;
import com.xiaoman.keep_system.pojo.vo.DateVo;
import com.xiaoman.keep_system.pojo.vo.ManagerVo;
import com.xiaoman.keep_system.utils.MyUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private ManagerDao managerDao;

    public void updateCusTime(int customerId){
        managerDao.updateCusTime(customerId);
    }

    public void deleteCus(int customerId){
        managerDao.deleteCus(customerId);
    }

    public void deleteCoach(int coachId){
        managerDao.deleteCoach(coachId);
    }

    public List<String> uploadImg(MultipartFile[] pictures) throws IOException {
        return MyUpload.pictureUpload(pictures);
    }

    public void share(Share share){
        managerDao.share(share);
    }

    public void share(List<String> list,String content,String name,int praise,Date shareTime){
        String firImg = "";
        String secImg = "";
        String thiImg = "";
        if (list.size() == 1){
            firImg = list.get(0);
        }
        if (list.size() == 2){
            firImg = list.get(0);
            secImg = list.get(1);
        }
        if (list.size() == 3){
            firImg = list.get(0);
            secImg = list.get(1);
            thiImg = list.get(2);
        }
        Share share = new Share(null,content,firImg,secImg,thiImg,name,praise,shareTime);
        managerDao.share(share);
    }

    public void updateManager(int managerId, ManagerVo managerVo){
        managerDao.updateManager(new Manager(managerId,managerVo));
    }

    public void delShare(int shareId){
        managerDao.delComment(shareId);
        managerDao.delShare(shareId);
    }
}
