package com.example.roubaisha.counter.Names;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.roubaisha.counter.R;

import java.util.ArrayList;


public class MuhammadNamesActivity extends AppCompatActivity {

    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muhammad_names);

        getSupportActionBar().setTitle("Muhammad Names");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.re);
        mLayoutManager = new LinearLayoutManager(MuhammadNamesActivity.this);
        /* RecyclerView.LayoutManager la = new StaggeredGridLayoutManager(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS, StaggeredGridLayoutManager.VERTICAL);*/
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<MuhammadNamesModel> arrayList=new ArrayList<MuhammadNamesModel>();
        arrayList.add(new MuhammadNamesModel("مُحَمَّد","Muhammad","Highly Praised","محمد",R.raw.muhammadd));
        arrayList.add(new MuhammadNamesModel("اَحمَدٌ","Ahmed","Most Commendable","احمد",R.raw.ahmedd));
        arrayList.add(new MuhammadNamesModel("حَامدٌ","Hamid","Praising","حامد",R.raw.hamidd));
        arrayList.add(new MuhammadNamesModel(" مَحمُود","Mahmood","Praised","محمود",R.raw.mehmooddd));
        //arrayList.add(new MuhammadNamesModel(" قَاسِمٌٌ","Qasim","A Distributor","قاسم",R.raw.qasim));
        arrayList.add(new MuhammadNamesModel(" عَاقِبٌ","Aqib","Following the Last","عاقب",R.raw.aqibb));
        arrayList.add(new MuhammadNamesModel(" فَاتِحٌ","Fatih","Conqueror Opener"," فاتح",R.raw.fatihh));
        arrayList.add(new MuhammadNamesModel(" شَاهِد","Shahid","Witness"," شاهد",R.raw.shahid));
        arrayList.add(new MuhammadNamesModel("ٌ حَاشِرٌ","Hashir","Who Gather People","حاشر",R.raw.hashirr));
        //arrayList.add(new MuhammadNamesModel(" رَشِيد","Rasheed","Well Guided","رشيد",R.raw.rasheed));

        arrayList.add(new MuhammadNamesModel("مَشهُودٍ","Mashood","Witnessed"," مشهود",R.raw.mashooddd));
        arrayList.add(new MuhammadNamesModel("ٌبَشِيرٌ","Bashir","Bringer of Good Tidings"," بشير",R.raw.bashirr));
        //arrayList.add(new MuhammadNamesModel("نَذِير","Nadhir","Warner"," نذير",R.raw.nazir));
        arrayList.add(new MuhammadNamesModel("ٌدَاع","Da'i","Caller"," داع",R.raw.daiii));
        //arrayList.add(new MuhammadNamesModel("ٍشَافٍ","Shafi","Healer"," شاف",R.raw.shafii));
        arrayList.add(new MuhammadNamesModel("هَادٍ","Hadi","He Who Guides Right"," هاد",R.raw.hadiii));
        arrayList.add(new MuhammadNamesModel("مَهد","Mahdi","He Who Is Well Guided"," مهد",R.raw.mahdiii));
        arrayList.add(new MuhammadNamesModel("ٍمَاحٍ","Mahi","He Who Wipes Out"," ماح",R.raw.mahiii));
        //arrayList.add(new MuhammadNamesModel("مُنجٍ","Munji","He Who Saves Delivers"," منج",R.raw.munji));
        //arrayList.add(new MuhammadNamesModel("نَاه","Nahi","Safe"," ناه",R.raw.nahi));

        //arrayList.add(new MuhammadNamesModel("رَسُول","Rasool","Messenger","رسول",R.raw.rasool));
        //arrayList.add(new MuhammadNamesModel("ٌنَبِيٌٌّ","Nabi","Prophet","نبي",R.raw.nabi));
        //arrayList.add(new MuhammadNamesModel("اُمِّيٌّ","Ummi","Unlettered","امي",R.raw.ummi));
        //arrayList.add(new MuhammadNamesModel("تِهَامِيٌّ","Tihami","From the Tihama","تهامي",R.raw.tihami));
        arrayList.add(new MuhammadNamesModel("هَاشَمِيٌّ","Hashimi","Family of Hashim","هاشمي",R.raw.hashimii));
        arrayList.add(new MuhammadNamesModel("اَبطَحِيٌّ","Abtahi","Belonging to Al-Batha","ابطحي",R.raw.abtahii));
        arrayList.add(new MuhammadNamesModel("عَزِيز","A'zi-z","Noble,Dear","عزيز",R.raw.azizz));
        arrayList.add(new MuhammadNamesModel("ٌحَرِيصٌ عَلَيكُم","Haris Alaikum","Full of Concern for You","حريص عليكم",R.raw.hareesalaikumm));
        arrayList.add(new MuhammadNamesModel("رَءُوف","Ra'uf","Mild","رءوف",R.raw.rauf));
//        arrayList.add(new MuhammadNamesModel("ٌرَحِيم","Rahim","Merciful","رحيم",R.raw.raheem));

        //arrayList.add(new MuhammadNamesModel("طَهَ","Taha","Sura 20:1","طه ",R.raw.taha));
        arrayList.add(new MuhammadNamesModel("مُجتَبَىٌّ","Mujtaba","Elect","مجتبى",R.raw.mujtabaaa));
        //arrayList.add(new MuhammadNamesModel("طَس","Tasin","Sura 27:1","طس",R.raw.taseen));
        //arrayList.add(new MuhammadNamesModel("مُرتَضَى","Murtaza","Content","مرتضى",R.raw.murtaza));
        arrayList.add(new MuhammadNamesModel("حَم","Ha-mim","Begining of Suras 40-46","حم",R.raw.hamimm));
        //arrayList.add(new MuhammadNamesModel("مُصطَفَى","Mustafa","Chosen","مصطفى",R.raw.mustafa));
        //arrayList.add(new MuhammadNamesModel("يَس","Ya-sin","Sura 36:1","يس",R.raw.yaseen));
        arrayList.add(new MuhammadNamesModel("اَولَي","Aula","Most Worthy","اولي",R.raw.aulaa));
        //arrayList.add(new MuhammadNamesModel("مُزَّمِّلٌ","Muzammil","Wrapped","مزمل",R.raw.muzammil));
        arrayList.add(new MuhammadNamesModel("وَلِي","Wali","Friend","ولي",R.raw.wali));

        arrayList.add(new MuhammadNamesModel("مُدَّثِّرٌٌّ","Mudassir ","Covered","مدثر",R.raw.mudassirrr));
        arrayList.add(new MuhammadNamesModel("مَتِينٌ","Matin","Firm","متين",R.raw.mateennn));
        //arrayList.add(new MuhammadNamesModel("مُصَدِّقٌ","Musaddiq","Who Declares for True","مصدق",R.raw.musaddiq));
        //arrayList.add(new MuhammadNamesModel("طَيِّبٌ","Tayyib","Good","طيب",R.raw.tayyib));
        //arrayList.add(new MuhammadNamesModel("نَاصِرٌ","Nasir","Helper","ناصر",R.raw.nasir));
        arrayList.add(new MuhammadNamesModel("مَنصُور","Mansoor","Victorious","منصور",R.raw.mansoorrr));
        arrayList.add(new MuhammadNamesModel("ٌمِصبَاح","Misbah","Lamp","مصباح",R.raw.misbahhh));
        arrayList.add(new MuhammadNamesModel("ٌاَمِر","Amir","Prince, Commander","امر",R.raw.amirr));
        arrayList.add(new MuhammadNamesModel("ٌحِجَازِىٌّ","Hijazi","From the Hijaz","حجازى",R.raw.hijazii));
        //arrayList.add(new MuhammadNamesModel("نَزَارىِ","Nazari","","نزارى",R.raw.nazari));

        //arrayList.add(new MuhammadNamesModel("قُرَيشِىٌِّ","Quraishi","From the Clan Quraish","قريشى",R.raw.quraishi));
        arrayList.add(new MuhammadNamesModel("مُضَرِىٌّ","Mudari","From the Tribe Mudar","مضرى",R.raw.mudariii));
        //arrayList.add(new MuhammadNamesModel("نَبِىُّ التَّوبَة","Nabi-at-Tauba","TheProphet of Repentance","نبى التوبة",R.raw.nabiattauba));
        arrayList.add(new MuhammadNamesModel("حَافِظٌ","Hafiz","Preserver","حافظ",R.raw.hafizzz));
        arrayList.add(new MuhammadNamesModel("كَامِل","Kamil","Perfect","كامل",R.raw.kamill));
        //arrayList.add(new MuhammadNamesModel("ٌصَادِقٌ","Sadiq","Sincere","صادق",R.raw.sadiq));
        arrayList.add(new MuhammadNamesModel("اَمِينٌ","Amin","Trustworthy","امين",R.raw.aminn));
        arrayList.add(new MuhammadNamesModel("عَبدُاللّهِ","AbdAllah","God's Servant","عبدالله",R.raw.abdullahh));
        arrayList.add(new MuhammadNamesModel("كَلِيمُ اللّه","KalimAllah","He to whom God Has Talked","كليم الله",R.raw.kalimullahh));
        arrayList.add(new MuhammadNamesModel("ِحَبِيبُ اللّه","HabibAllah","God's Beloved Friend","حبيب الله",R.raw.habibullahhh));

        //arrayList.add(new MuhammadNamesModel("نَجِىُّ اللهِ","Naji Allah","God's Intimate Friend","نجى الله",R.raw.njaiullah));
        //arrayList.add(new MuhammadNamesModel("صَفِىُّ اللهٌِّ","Safi Allah","God's Sincere Friend","صفى الله",R.raw.safiullah));
        arrayList.add(new MuhammadNamesModel("خَاتِمُ الانبِيَآء","Khatim al-Anbiya","Seal of the Prophets","خاتم الانبيآء",R.raw.khatimulanbiyaa));
        arrayList.add(new MuhammadNamesModel("حَسِيبٌ","Hasib","Respected","حسيب",R.raw.hasibb));
        arrayList.add(new MuhammadNamesModel("مُجِيبٌ","Mujeeb","Complying, Replying","مجيب",R.raw.mujib));
        //arrayList.add(new MuhammadNamesModel("شَكُورٌ","Shakoor","Most Grateful","شكور",R.raw.shakoor));
        //arrayList.add(new MuhammadNamesModel("مُقتَصِدٌ","Muqtasid","Adopting a Middle Course","مقتصد",R.raw.muqtasid));
        //arrayList.add(new MuhammadNamesModel("رَسُولُ الرَّحمَةِ","Rasool ar-Rehma","The Messenger of Mercy","رسول الرحمة",R.raw.rasoolurrehma));
        arrayList.add(new MuhammadNamesModel("قَوِىٌّ","Qawi","Strong","قوى",R.raw.qawi));
        arrayList.add(new MuhammadNamesModel("حَفِى","Hafi","Well-informed","حفى",R.raw.hafiii));

        arrayList.add(new MuhammadNamesModel("مَامُونٌ","Ma'mun","Trusted","مامون",R.raw.mamoonn));
        arrayList.add(new MuhammadNamesModel("ٌمَعلُوم","Ma'lum","Well-Known","معلوم",R.raw.maloommm));
        arrayList.add(new MuhammadNamesModel("ٌحقٌّ","Haqq","Truth","حق",R.raw.haqq));
        arrayList.add(new MuhammadNamesModel("مُبِينٌ","Mubin","Clear, Evident","مبين",R.raw.mubinnn));
        //arrayList.add(new MuhammadNamesModel("مُطِيعٌ","Muti","Obedient","مطيع",R.raw.mutih));
        arrayList.add(new MuhammadNamesModel("اَوَّلٌ","Awwal","First","اول",R.raw.awwall));
        arrayList.add(new MuhammadNamesModel("اَخِر","Akhir","Last","اخر",R.raw.akhirr));
        arrayList.add(new MuhammadNamesModel("ٌظَاهِر","Zahir","Outward, External","ظاهر",R.raw.zahir));
        arrayList.add(new MuhammadNamesModel("ٌبَاطِنٌ","Batin","Internal, Inner","باطن",R.raw.batinn));
        //arrayList.add(new MuhammadNamesModel("يَتِيم","Yateem","Orphan","يتيم",R.raw.yateem));

        arrayList.add(new MuhammadNamesModel("كَرِيمٌ","Karim","Generous","كريم",R.raw.karimm));
        arrayList.add(new MuhammadNamesModel("حَكِيمٌ","Hakim","Wise, Judicious","حكيم",R.raw.hakimm));
        //arrayList.add(new MuhammadNamesModel("سَيِّدٌ","Sayyid","Lord","سيد",R.raw.sayyid));
        //arrayList.add(new MuhammadNamesModel("سِرَاج","Siraj","Lamp","سراج",R.raw.siraj));
        //arrayList.add(new MuhammadNamesModel("ٌمُنِيرٌ","Munir","Radiant","منير",R.raw.munir));
        arrayList.add(new MuhammadNamesModel("مُحَرَّم","Muharram","Forbidden, Immune","محرم",R.raw.muharramm));
        arrayList.add(new MuhammadNamesModel("ٌمُكَرَّمٌ","Mukarram","Honored, Venerated","مكرم",R.raw.mukarramm));
        arrayList.add(new MuhammadNamesModel("مُبَشِّرٌٌ","Mubashir","Bringer of Good News","مبشر",R.raw.mubashirrr));
        //arrayList.add(new MuhammadNamesModel("مُذَكِّرٌ","Muzakkir","Preacher","مذكر",R.raw.muzakir));
        //arrayList.add(new MuhammadNamesModel("مُطَهَّر","Mutahhar","Purified","مطهر",R.raw.mutahhar));

        //arrayList.add(new MuhammadNamesModel("قَرِيبٌ","Qarib","Near","قريب",R.raw.qarib));
        arrayList.add(new MuhammadNamesModel("خَلِيلٌ","Khalil","Good Friend","خليل",R.raw.khalill));
        arrayList.add(new MuhammadNamesModel("مَدعُو","Mad'u","Who is Called","مدعو",R.raw.maduu));
        arrayList.add(new MuhammadNamesModel("ّجَوَّادٌ","Jawwad","Generous, Magnanimous","جواد",R.raw.jawwadd));
        arrayList.add(new MuhammadNamesModel("خَاتِمٌِ","Khatim","Seal","خاتم",R.raw.khatimm));
        arrayList.add(new MuhammadNamesModel("عَادِلٌ","Adil","Just","عادل",R.raw.adill));
        //arrayList.add(new MuhammadNamesModel("شَهِير","Shaheer","চWell-Known","شهير",R.raw.shaheer));
        //arrayList.add(new MuhammadNamesModel("ٌشَهِيدٌ","Shahid","Witnessing, Martyr","شهيد",R.raw.shaheed));
        //arrayList.add(new MuhammadNamesModel("رَسُولُ المَلاحِم","Rasool al-Malahim","TheMessenger of The Battle of The Last Day","رسول الملاحم",R.raw.rasoolalmalahim));



        MRecyclerAdapter adapter=new MRecyclerAdapter(MuhammadNamesActivity.this,arrayList);
        recyclerView.setAdapter(adapter);
    }
}
