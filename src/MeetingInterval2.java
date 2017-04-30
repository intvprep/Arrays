import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingInterval2 {

	public static void main(String[] args) {
		MeetingInterval2 meetingIntervals = new MeetingInterval2();
		List<List<Interval>> intervals = new LinkedList<>();
		for (int i = 0; i < 3; i++) {
			intervals.add(new LinkedList<>());
			switch (i) {
				case 0: 
					intervals.get(i).add(meetingIntervals.new Interval(1,3)); //2
					intervals.get(i).add(meetingIntervals.new Interval(6,7)); //1
					break;
				case 1:
					intervals.get(i).add(meetingIntervals.new Interval(2,4));//2
					break;
				case 2:
					intervals.get(i).add(meetingIntervals.new Interval(2,3));//1
					intervals.get(i).add(meetingIntervals.new Interval(9,12));//3
					break;
			}
		}
		List<Interval> freeIntervals = meetingIntervals.findFreeIntervals(intervals);
		System.out.println("Below are the free intervals");
		for (Interval interval : freeIntervals) {
			System.out.println(interval.toString());
		}
	}
	
	public List<Interval> findFreeIntervals(List<List<Interval>> intervals) {
		List<Interval> result = new LinkedList<>();
		if (intervals == null || intervals.size() == 0) {
			return result;
		}
		LinkedList<Interval> all = new LinkedList<>();
		for (int i = 0; i < intervals.size(); i++) {
			for (int j = 0; j < intervals.get(i).size(); j++) {
				all.add(intervals.get(i).get(j));
			}
		}
		Collections.sort(all, (a,b) -> (a.startTime - b.startTime)); //sort meetings on start time 
		//[[1 3], [2 4], [2 3], [6 7], [9 12]]
		System.out.println("Sorted intervals on start time: "+all);
		
		ListIterator<Interval> listIterator = all.listIterator();
		Interval prev = null;
		while(listIterator.hasNext()){
			Interval curr = listIterator.next();
			if(prev == null){
				prev = curr;
				continue;
			}
			if(prev.endTime>curr.startTime){
				prev.endTime = Math.max(prev.endTime, curr.endTime);
				listIterator.remove();
			}
		}
		prev = all.get(0);
		for(int i=1;i<all.size();i++){
			Interval curr = all.get(i);
			result.add(new Interval(prev.endTime, curr.startTime));
			prev=curr;
		}
		System.out.println(all);
		return result;
	}
	
	public class Interval {
		int startTime;
		int endTime;
		
		public Interval(int start, int end) {
			startTime = start;
			endTime = end;
		}
		
		@Override
		public String toString() {
			return "[" + startTime + " " + endTime+"]";
		}
	}

}