package com.tutorial.appskeleton.korisnici.services;

import java.util.List;

import com.tutorial.appskeleton.korisnici.models.Korisnik;

/**
 * 
 * @author dpondeljak
 *
 */
public interface KorisnikService{
	/**
	 * spremanje korisnika 
	 * @param pKorisnik - korisnički objekt
	 */
	public void spremiKorisnika(Korisnik pKorisnik);
	
	/**
	 * Traženje korisnika po id-u
	 * @param id
	 * @return objekt pronadjenog korisnika 
	 */
	public Korisnik nadjiKorisnikaById(int id);
	
	/**
	 * Uređivanje korisnika 
	 * @param id - id korisnika 
	 * @param pKorsinik - objekt uređenog korisnika 
	 * @return objekt uređenog korisnika 
	 */
	public Korisnik urediKorisnikaById(int id, Korisnik pKorsinik);
	
	/**
	 * Brisanje korisnika po id-u
	 * @param id
	 */
	public void brisiKorisnikaById(int id);
	
	/**
	 * Lista korisnika 
	 * @return lista korisnika 
	 */
	public List<Korisnik> listaKorisnika();
	
	public void promjeniStatusKorisinka();
	
	
}
