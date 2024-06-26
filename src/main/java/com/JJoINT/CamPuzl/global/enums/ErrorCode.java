package com.JJoINT.CamPuzl.global.enums;

import lombok.Getter;

@Getter
public enum ErrorCode {
    // Common
    INVALID_INPUT_VALUE(400, "C001", "유효하지 않은 입력 값입니다"),
    METHOD_NOT_ALLOWED(405, "C002", "지원하지 않는 메서드입니다"),
    ENTITY_NOT_FOUND(404, "C003", "엔티티를 찾을 수 없습니다"),
    INTERNAL_SERVER_ERROR(500, "C004", "서버에서 에러가 발생했습니다"),
    INVALID_TYPE_VALUE(400, "C005", "유효하지 않은 형식의 값입니다"),
    HANDLE_ACCESS_DENIED(403, "C006", "접근 권한이 없습니다"),
    URL_NOT_FOUND(404, "C007", "요청한 주소의 API를 찾을 수 없습니다"),
    MISSING_PARAMETER(400, "C008", "필수 값인 매개변수를 찾을 수 없습니다"),
    DATA_INTEGRITY_VIOLATION(400, "C008", "잘못된 데이터에 접근하였습니다, 요청 값을 확인해주세요"),
    HTTP_MESSAGE_NOT_READABLE(400, "C009", "잘못된 JSON 요청 형식입니다"),
    ILLEGAL_ARGUMENT(400, "C010", "잘못된 인수 값이 포함된 요청입니다"),
    ORGANIZATION_NOT_FOUND(400,"C011","소속이 없습니다"),
    DATE_TIME_PARSE_FAILURE(400, "C012", "잘못된 DateTime 형식입니다"),
    HTTP_MESSAGE_CONVERSION(500, "C013", "요청 데이터 변환에 실패했습니다. 고객센터로 문의해주세요"),

    // Member
    MEMBER_NOT_FOUND(404, "M001", "존재하지 않는 회원입니다"),
    MEMBER_PROFILE_DUPLICATION(400, "M002", "이미 존재하는 회원입니다"),
    INVALID_PASSWORD(404,"M003", " 잘못된 비밀번호 입니다"),


    // Booth
    BOOTH_DUPLICATE_LOCATION(400, "B001", "동일한 위치의 부스가 이미 존재합니다"),
    BOOTH_NOT_FOUND(404, "B002", "존재하지 않는 부스입니다"),
    BOOTH_ALREADY_DELETED(404, "B003", "이미 삭제된 부스입니다"),


    //BoothComment
    BOOTH_COMMENT_NOT_FOUND(404, "BC001", "존재하지 않은 부스 코멘트입니다"),
    BOOTH_COMMENT_ALREADY_RATED(400, "BC002", "해당 부스에 이미 등록된 평점이 있습니다."),

    // Token
    MISMATCH_REFRESH_TOKEN(401, "T001", "유효하지 않은 리프레시 토큰입니다"),
    NO_PERMISSION(401, "T002", "요청에 대한 권한이 없습니다"),

    //Reservation
    ALREADY_EXIST_OTHER_PUPTABLE(400,"R001","다른 예약이 확정되어 있습니다. 결제를 완료하고 다른 예약을 진행해 주세요"),
    NOT_YET_RESERVED(400,"R002","예약이 확정되지 않았습니다. 기다려주세요"),

    //Pub
    PUB_NOT_FOUND(404, "P001", "존재하지 않는 주점입니다."),
    MENU_NOT_FOUND(404, "P002", "존재하지 않는 메뉴입니다.");

    private final String code;
    private final String message;
    private final int status;

    ErrorCode(final int status, final String code, final String message) {
        this.status = status;
        this.message = message;
        this.code = code;
    }

}
