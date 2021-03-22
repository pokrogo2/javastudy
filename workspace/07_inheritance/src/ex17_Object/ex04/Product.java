package ex17_Object.ex04;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {

	private String model;
	private String manufacturer;
	private String data;	


@Override
public boolean equals(Object obj) {
	if(this==obj) {
		return true;
	}
	if(obj instanceof Product) {
		Product p = (Product)obj;
		//모델과 제조사 비교 동일하면 true 아니면 false
		//p1.equals(p2)인경우 p1의 모델은 자기자신이니까 그냥model 또는 this
		//p2의 모델은 현재 p니까 p=obj로 변환된상태. p.model로 부르면됨.
		if(this.equals(p.getModel())&& manufacturer.equals(p.manufacturer)){
			return true;
		}else {
		return false;
			}
	}
	// TODO Auto-generated method stub
	return false;
}}