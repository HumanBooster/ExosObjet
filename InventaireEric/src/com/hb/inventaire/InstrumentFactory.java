package com.hb.inventaire;

import java.util.HashMap;
import java.util.Map;

import com.hb.inventaire.enums.Bois;
import com.hb.inventaire.enums.Fabricant;
import com.hb.inventaire.enums.Famille;
import com.hb.inventaire.enums.Propriete;
import com.hb.inventaire.enums.Style;
import com.hb.inventaire.enums.Type;
import com.hb.inventaire.enums.TypeInstrument;

public abstract class InstrumentFactory {


	public static Instrument makeInstrument(String numSerie, double prix,
			PrefInstrument preferences) {
		return new Instrument(numSerie, prix, preferences);
	}
	
	public static Instrument makeGuitare(String numSerie, double prix, Fabricant fabricant,
			String modele, Type type, Bois boisFond, Bois boisTable, int nbCordes)
	{
		Map<Propriete,Object> proprietes = new HashMap<Propriete,Object>();
		proprietes.put(Propriete.INSTRUMENT, TypeInstrument.GUITARE);
		
		proprietes.put(Propriete.FABRICANT, fabricant);
		proprietes.put(Propriete.MODELE, modele);
		proprietes.put(Propriete.TYPE, type);
		proprietes.put(Propriete.BOISFOND, boisFond);
		proprietes.put(Propriete.BOISTABLE, boisTable);
		proprietes.put(Propriete.NBCORDES, nbCordes);
		
		return new Instrument(numSerie, prix, new PrefInstrument(proprietes));
	}
	
	public static Instrument makeMandoline(String numSerie, double prix, Fabricant fabricant,
			String modele, Type type, Bois boisFond, Bois boisTable, Style style)
	{
		Map<Propriete,Object> proprietes = new HashMap<Propriete,Object>();
		proprietes.put(Propriete.INSTRUMENT, TypeInstrument.MANDOLINE);
		
		proprietes.put(Propriete.FABRICANT, fabricant);
		proprietes.put(Propriete.MODELE, modele);
		proprietes.put(Propriete.TYPE, type);
		proprietes.put(Propriete.BOISFOND, boisFond);
		proprietes.put(Propriete.BOISTABLE, boisTable);
		proprietes.put(Propriete.STYLE, style);
		
		return new Instrument(numSerie, prix, new PrefInstrument(proprietes));
	}
	
	public static Instrument makeBanjo(String numSerie, double prix, Fabricant fabricant,
			String modele, Type type, Bois boisFond, Bois boisTable, int nbCordes)
	{
		Map<Propriete,Object> proprietes = new HashMap<Propriete,Object>();
		proprietes.put(Propriete.INSTRUMENT, TypeInstrument.BANJO);
		
		proprietes.put(Propriete.FABRICANT, fabricant);
		proprietes.put(Propriete.MODELE, modele);
		proprietes.put(Propriete.TYPE, type);
		proprietes.put(Propriete.BOISFOND, boisFond);
		proprietes.put(Propriete.BOISTABLE, boisTable);
		proprietes.put(Propriete.NBCORDES, nbCordes);
		
		return new Instrument(numSerie, prix, new PrefInstrument(proprietes));
	}
	
	public static Instrument makeViolon(String numSerie, double prix, Fabricant fabricant,
			String modele, Type type, Bois boisFond, Bois boisTable, Bois boisArchet)
	{
		Map<Propriete,Object> proprietes = new HashMap<Propriete,Object>();
		proprietes.put(Propriete.INSTRUMENT, TypeInstrument.VIOLON);
		
		proprietes.put(Propriete.FABRICANT, fabricant);
		proprietes.put(Propriete.MODELE, modele);
		proprietes.put(Propriete.TYPE, type);
		proprietes.put(Propriete.BOISFOND, boisFond);
		proprietes.put(Propriete.BOISTABLE, boisTable);
		proprietes.put(Propriete.BOISARCHET, boisArchet);
		
		return new Instrument(numSerie, prix, new PrefInstrument(proprietes));
	}
	
	public static Instrument makeHautBois(String numSerie, double prix, Fabricant fabricant,
			String modele, Famille famille, Bois boisTube)
	{
		Map<Propriete,Object> proprietes = new HashMap<Propriete,Object>();
		proprietes.put(Propriete.INSTRUMENT, TypeInstrument.HAUTBOIS);
		
		proprietes.put(Propriete.FABRICANT, fabricant);
		proprietes.put(Propriete.MODELE, modele);
		proprietes.put(Propriete.FAMILLE, famille);
		proprietes.put(Propriete.BOISTUBE, boisTube);
		
		return new Instrument(numSerie, prix, new PrefInstrument(proprietes));
	}
}
