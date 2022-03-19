package pattern.command;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public abstract class Command implements Delayed, Runnable {

	private static Clock clock = Clock.systemUTC() ;
	
	private final Instant runAt;
	
	public Command(Duration duration) {
		this.runAt = clock.instant().plusMillis(duration.toMillis());
	}
	
	
	@Override
	public int compareTo(Delayed arg0) {
		return this.runAt.compareTo(((Command) arg0).runAt);
	}


	@Override
	public long getDelay(TimeUnit unit) {
		long  delayMillis = runAt.toEpochMilli() - clock.millis();
		return unit.convert(delayMillis,TimeUnit.MICROSECONDS);
	}

	public String timeToRun() {
		return runAt.toString();
	}
}
