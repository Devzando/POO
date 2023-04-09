public class VerifyYear {

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public boolean isLeap(){
        if(this.year % 4 == 0){
            if(this.year % 100 == 0){
                if(this.year % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else {
                return true;
            }
        }else{
            return false;
        }
    }
}
