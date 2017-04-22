import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingInterval {

	public static void main(String[] args) {
		MeetingInterval meetingIntervals = new MeetingInterval();
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


		PriorityQueue<Interval> pq = new PriorityQueue<>((a,b) -> a.endTime - b.endTime);
		
		pq.offer(all.get(0));
		for (int i = 1; i < all.size(); i++) {
			Interval prev = pq.poll();
			Interval cur = all.get(i);
			if (cur.startTime <= prev.endTime) {
				prev.endTime = Math.max(prev.endTime, cur.endTime);
			} else {
				pq.offer(cur);
			}
			pq.offer(prev);
		}
		System.out.println("After merging the intervals: "+pq);
		Interval prev = pq.poll();
		while (!pq.isEmpty()) {
			Interval cur = pq.poll();
			result.add(new Interval(prev.endTime, cur.startTime));
			prev = cur;
		}
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