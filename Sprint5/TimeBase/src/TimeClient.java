public class TimeClient implements Time{
    int hour, minute, day, month, year;

    @Override
    public void setDateTime(int hour, int minute, int day, int month, int year){
        this.hour = hour;
        this.minute = minute;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public void getTime(){
        System.out.print(hour+":"+minute+" "+month+"-"+day+"-"+year);
    }

}
