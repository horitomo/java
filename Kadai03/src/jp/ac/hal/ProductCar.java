package jp.ac.hal;

public class ProductCar {

	private String type;
	private String color;
	private int omosa;

	// 初期化
	public ProductCar() {
		this.type = "セダン";
		this.color = "黒";
		this.omosa = 1200;
	}

	// 走行メソッド
	public void drive() {
		System.out.println(this.color + "色の" + this.type + "が走る。");
	}

	// 停止メソッド
	public void stop() {
		System.out.println("止まる。");
	}

}
