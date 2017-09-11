package com.tutorial.appskeleton.korisnici.dao;

import com.tutorial.appskeleton.korisnici.models.Korisnik;

public interface KorisnikDAO {

	public void createKorisnik(Korisnik pKorisnik);
	
	public Korisnik findKorisnikaById(int id);
	
	public void updateKorisnik(int id, Korisnik pKorisnik);
	
	public void deleteKorisnik(int id);
	
}
