package com.ssafy.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 유저 회원가입 API ([POST] /api/v1/users) 요청에 필요한 리퀘스트 바디 정의.
 */
@Getter
@Setter
@ApiModel("NoticeRegisterPostReq")
public class NoticeRegisterPostReq {
	@ApiModelProperty(name = "클래스 ID", example = "1")
	int studyId;
	@ApiModelProperty(name = "선생 ID", example = "tchr_id")
	String tchrId;
	@ApiModelProperty(name = "공지사항 제목", example = "공지사항입니다.")
	String noticeTitle;
	@ApiModelProperty(name = "공지사항 본문", example = "공지사항 내용")
	String noticeContent;
}
