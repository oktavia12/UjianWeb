package com.ujianweb.juarakoding.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ujianweb.juarakoding.entity.Laporan;



public interface LaporanRepository extends CrudRepository<Laporan, Long> {
	
	public Laporan findById(long id);
	public Laporan findByNama(String nama);
	
//	@Query ("select count(i) from laporan i where i.status ='Approve'")
//    List<Object> countLaporanApprove();
}
