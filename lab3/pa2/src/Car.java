import java.util.Date;
/*
* 构造方法：
public Car(int pNum, int coverAmount, double premium, Date stareDate, int last)：初始化车辆保险的属性。
getPolocyNumber：
@Override public int getPolocyNumber()：返回保单号码pNum。
getCoverAmount：
@Override public int getCoverAmount()：返回保险金额coverAmount。
calculatePremium：
@Override public double calculatePremium()：返回保费premium。
getExpiryDate：
@Override public Date getExpiryDate()：计算并返回保险到期日期，通过调用addDate方法实现。
addDate：
Date addDate(Date d, long lasted)：将给定日期d加上指定天数lasted，返回新的日期。具体步骤如下：
获取日期d的时间戳。
将lasted转换为毫秒数。
将时间戳加上转换后的毫秒数。
返回新的日期对象。
* */

/**
 * Car类实现了Insurance接口，用于处理汽车保险的相关信息
 */
public class Car implements Insurance {
    // 保险单号
    int pNum;
    // 保险覆盖金额
    int coverAmount;
    // 保险费
    double premium;

    // 保险开始日期
    Date stareDate;

    // 保险持续时间（以天为单位）
    int last;

    /**
     * 获取保险单号
     *
     * @return 保险单号
     */
    @Override
    public int getPolocyNumber() {
        return pNum;
    }

    /**
     * 获取保险覆盖金额
     *
     * @return 保险覆盖金额
     */
    @Override
    public int getCoverAmount() {
        return coverAmount;
    }

    /**
     * 计算保险费
     *
     * @return 保险费
     */
    @Override
    public double calculatePremium() {
        return premium;
    }

    /**
     * 获取保险到期日期
     *
     * @return 保险到期日期
     */
    @Override
    public Date getExpiryDate() {
        // 计算并返回保险的到期日期
        return addDate(stareDate, last);
    }

    /**
     * 添加日期方法，用于计算保险的到期日期
     *
     * @param d      开始日期
     * @param lasted 持续时间（以天为单位）
     * @return 计算后的日期
     */
    Date addDate(Date d, long lasted) {
        long time = d.getTime();
        lasted = lasted * 24 * 60 * 60 * 1000;
        time += lasted;
        return new Date(time);
    }

    /**
     * Car类构造器
     *
     * @param pNum       保险单号
     * @param coverAmount 保险覆盖金额
     * @param premium     保险费
     * @param stareDate   保险开始日期
     * @param last        保险持续时间（以天为单位）
     */
    public Car(int pNum, int coverAmount, double premium, Date stareDate, int last) {
        this.pNum = pNum;
        this.coverAmount = coverAmount;
        this.premium = premium;
        this.stareDate = stareDate;
        this.last = last;
    }
}

