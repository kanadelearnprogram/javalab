import java.util.Date;
/*
*
*定义了一个名为 Insurance 的接口，其中包含四个方法：
getPolocyNumber()：获取保单号码。
getCoverAmount()：获取保险金额。
calculatePremium()：计算保费。
getExpiryDate()：获取保险到期日期
*  */
public interface Insurance {
    int getPolocyNumber();
    int getCoverAmount();
    double calculatePremium();
     Date getExpiryDate();
}
