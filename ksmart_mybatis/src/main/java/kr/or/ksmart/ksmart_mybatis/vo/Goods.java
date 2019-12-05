package kr.or.ksmart.ksmart_mybatis.vo;

public class Goods {

	private String goodsName;
	private String goodsCate;
	private String goodsPrice;
	private String goodsColor;
	private String goodsBrand;
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsCate() {
		return goodsCate;
	}
	public void setGoodsCate(String goodsCate) {
		this.goodsCate = goodsCate;
	}
	public String getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsColor() {
		return goodsColor;
	}
	public void setGoodsColor(String goodsColor) {
		this.goodsColor = goodsColor;
	}
	public String getGoodsBrand() {
		return goodsBrand;
	}
	public void setGoodsBrand(String goodsBrand) {
		this.goodsBrand = goodsBrand;
	}
	
	@Override
	public String toString() {
		return "Goods [goodsName=" + goodsName + ", goodsCate=" + goodsCate + ", goodsPrice=" + goodsPrice
				+ ", goodsColor=" + goodsColor + ", goodsBrand=" + goodsBrand + "]";
	}
	
	
	
}
