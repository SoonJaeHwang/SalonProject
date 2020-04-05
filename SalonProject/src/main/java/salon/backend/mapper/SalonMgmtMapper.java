package salon.backend.mapper;

import org.apache.ibatis.annotations.Mapper;

import salon.backend.dto.SalonCustDto;

@Mapper
public interface SalonMgmtMapper {
	public SalonCustDto selectCustBasicInfo(SalonCustDto salonCustDto) throws Exception;
}