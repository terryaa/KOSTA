package Ex3;

public class Ex1_PojoMember {

//1. 회원의 정보를 기억하는 클래스 멤버로 저장
//객체의 기본값은 null -> new로 생성 안된 주소
	private Ex3_PojoDemo ep; ///100번
	
	
	public void setMember(Ex3_PojoDemo ep) {
		///들어오는 나이값을 판별해서 성년인지 미성년인지 구분하고
		//미성년이면 데이터를 입력하지 못하도록 구현해봅시다.
		if(ep.getAge() <= 19) {
			System.out.println("미성년자는 가입 불가");
			
		}else {
			this.ep = ep;
	
		}
			}
	
	//3. ep(회원)의 값을 출력하는 메서드
	public void printMember() {
		if(ep != null) {
			System.out.println("회원의 번호:" + ep.getNum());
			System.out.println("이름:" + ep.getName());
			System.out.println("아이디:" + ep.getId());
			if(ep.isAgree() == true) {
				System.out.println("수신 동의했습니다.");
			}
			else {
				System.out.println("수신 미동의했습니다.");
			}
		}
		}

}
