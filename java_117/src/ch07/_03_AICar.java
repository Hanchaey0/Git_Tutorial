package ch07;
//자식클래스 drive(), stop()
public class _03_AICar extends _03_Car{

		public void drive() {
			System.out.println("자율 주행합니다.");
			System.out.println("자동차가 알아서 방향을 전환합니다.");
}

		@Override
		public void stop() {
			System.out.println("스스로 멈춥니다.");
			
		}
}
