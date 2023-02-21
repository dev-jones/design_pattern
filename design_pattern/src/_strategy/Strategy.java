package _strategy;

/**
 * 가위바위보의 '전략'을 표현하는 인터페이스
 * @author choiyongho
 *
 */
public interface Strategy {

	public Hand nextHand();
	public void study(boolean win);		// 직전에 낸 손으로 이겼는지, 졌는지 학습한다.
}
