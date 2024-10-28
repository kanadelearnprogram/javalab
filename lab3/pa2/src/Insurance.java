import java.util.Date;

public interface Insurance {
    int getPolocyNumber();
    int getCoverAmount();
    double calculatePremium();
     Date getExpiryDate();
}
