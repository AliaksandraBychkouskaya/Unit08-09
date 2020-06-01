package by.tr.mod8;

public class Time {
    public int minute;
    public int second;
    public int hour;
    public Time(int _hour,int _minute,int _second)
    {
        if (_hour >= 0 && _hour < 24)
            this.hour = _hour;
        else
            this.hour = 0;
        if (_minute >= 0 && _minute < 60)
            this.minute = _minute;
        else
            this.minute = 0;
        if (_second >= 0 && _second < 60)
            this.second = _second;
        else this.minute = 0;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int _hour) {
        if (_hour >= 0 && _hour < 24)
        this.hour = _hour;
        else
            this.hour = 0;
    }

    public void setMinute(int _minute) {
        if (_minute >= 0 && _minute < 60)
        this.minute = _minute;
        else
            this.minute = 0;
    }

    public void setSecond(int _second) {
        if (_second > 0 && _second < 60)
        this.second = _second;
        else this.second = 0;
    }
    public void addHour (int addhour)
    {
        if (this.hour + addhour > 23){
            this.hour = (this.hour + addhour) % 24;
        }
        else this.hour = this.hour + addhour;
    }

    public void addSecond (int addsecond)
    {
        if (this.second + addsecond > 59)
        {
            addMinute((int)Math.floor((this.second + addsecond)/ 60));
            this.second = ((this.second + addsecond) % 60);
        }
        else this.second = this.second + addsecond;
    }
    public void addMinute(int addminute){
        if (this.minute + addminute > 59)
        {
            addHour((int)Math.floor((this.minute + addminute)/ 60));
            this.minute = (this.minute + addminute) % 60;
        }
        else this.minute = this.minute + addminute;
    }
}
