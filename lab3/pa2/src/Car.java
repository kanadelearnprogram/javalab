import java.util.Date;

public class Car implements Insurance {
    int pNum;
    int coverAmount;
    double premium;

    Date stareDate;

    int last;

    //Date endDate;
    @Override
    public int getPolocyNumber() {
        return pNum;
    }

    @Override
    public int getCoverAmount() {
        return coverAmount;
    }

    @Override
    public double calculatePremium() {
        return premium;
    }

    @Override
    public Date getExpiryDate() {

        return addDate(stareDate,last);
    }
    Date addDate(Date d,long lasted){//日期转换
        long time=d.getTime();
        lasted=lasted*24*60*60*1000;
        time +=lasted;
        return new Date(time);
    }

    public Car(int pNum, int coverAmount, double premium, Date stareDate, int last) {
        this.pNum = pNum;
        this.coverAmount = coverAmount;
        this.premium = premium;
        this.stareDate = stareDate;
        this.last = last;
    }
}
