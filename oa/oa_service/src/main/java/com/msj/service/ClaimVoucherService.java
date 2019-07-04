package com.msj.service;

import com.msj.entity.ClaimVoucher;
import com.msj.entity.ClaimVoucherItem;
import com.msj.entity.DealRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ClaimVoucherService {
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);
    List<ClaimVoucher> findSelf(String createSn);
    List<ClaimVoucher> findForDeal(String createSn);
    ClaimVoucher findclaimVoucher(Integer id);

    List<ClaimVoucherItem> findItems(Integer cid);
    List<DealRecord> findRecords(Integer id);
}
