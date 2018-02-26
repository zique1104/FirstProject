package blog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blog.dto.output.TouPiaoDTO;
import blog.mapper.TouPiaoMapper;
import blog.service.ITouPiaoService;

@Service
public class TouPiaoService implements ITouPiaoService{

	@Autowired
	private TouPiaoMapper mapper; 
	
	@Override
	public Integer addTouPiao(TouPiaoDTO dto) {
		Integer touPiaoDao = mapper.touPiaoDao(dto);
		return touPiaoDao;
	}

}
