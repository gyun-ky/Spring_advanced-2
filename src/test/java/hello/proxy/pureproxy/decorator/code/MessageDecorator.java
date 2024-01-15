package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecorator implements Component{

	private Component component;

	public MessageDecorator(Component component) {
		this.component = component;
	}

	public String operation() {
		log.info("MessageDecorator 실행");

		String result = component.operation();
		String decoResult = "*****" + result + "*****";
		log.info("MessageDecoratpr 꾸미기 전용 전 = {}, 적용 후={}", result, decoResult);

		return decoResult;

	}
}
