package meetingRooms;

class Interval{
    int start;
    int end;
    Interval(){
        this.start = 0;
        this.end =0;
    }
    Interval(int s, int e){
        this.start = s;
        this.end = e;
    }
}
public class MeetingRooms {

    public static void main(String[] args){
        MeetingRooms a = new MeetingRooms();

        Interval in1 = new Interval(15,20);
        Interval in2 = new Interval(5,10);
        Interval in3 = new Interval(0,30);

        Interval[] intervals = {in1,in2,in3};
        System.out.println(a.solve(intervals));

    }

    public boolean solve(Interval[] intervals) {

        if(intervals == null){
            return false;
        }
        print(intervals);
        return true;
    }

    public void print(Interval[] intervals){
        for (Interval interval : intervals) {
            System.out.println(interval.start + " " + interval.end);
        }
    }
}
