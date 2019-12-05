package kr.or.ksmart.ksmart_mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.ksmart_mybatis.vo.Goods;

@Mapper
public interface GoodsMapper {
	
	//전체 상품 조회
	List<Goods> getGoodsList();
}
