package classe.relogio;

public class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);

    }


    public int getHour(){
        return hour;
    }

    public void setHour(int hour){
        if(hour>23 || hour<0){
            System.out.println("fail: hora invalida");
            return;
        }
        this.hour=hour;

    }

    public int  getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        if(minute>59 || minute<0){
            System.out.println("fail: minuto invalido");
            return;
        }
        this.minute=minute;
    }

    public int  getSecond(){
        return second;
    }
    public void setSecond(int second){
        if(second>59 || second<0){
            System.out.println("fail: segundo invalido");
            return;
        }
        this.second=second;
    }


    public void nextSecond(){
        second++;
        if(second>59){
            second=0;
            minute++;
        }
        if(minute>59){
            minute=0;
            hour++;
        }
        if(hour>23){
            hour=0;
        }
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}
