package io.github.arahmandc.android.limabd;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


//        Following from:
//        https://www.youtube.com/watch?v=9_uLZdS_K_g&t=1s
//        https://drive.google.com/file/d/1fckwnAxhCFiR1uvZD7XiCPz8LHsVLJre/edit

public class Poem extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        rcv = (RecyclerView) findViewById(R.id.recview);

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rcv.setLayoutManager(linearLayoutManager);

    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("be mf¨Zv");
        ob1.setDesc("D”Q&wmZ Zi‡½ Ggb ‡Kb K‡iv?\n" +
                "Kv‡jv ‡Pv‡Li bxwjgvq\n" +
                "A™¢yZy‡o ‡Lqvj Zvgvkvq\n" +
                "‡LjvN‡ii gZ wb‡R‡K fv‡Ov-M‡ov?\n" +
                "\n" +
                "KL‡bv wK Zywg ‡`LQ\n" +
                "gy³Siv nvwmi A›`‡ii welv³ wbtk¦vm!\n" +
                "ï‡b‡Qv wK-\n" +
                "‡`qv‡ji Pvcv c«wZaŸwb‡Z\n" +
                "gaygwZi Kvbœv‡fRv ey‡Ki ¶Z NvZ?\n" +
                "KB Avwg ‡Zv ‡Zvgvi c«evj mgy`«Z‡U......\n" +
                "Akvš— mvMi ‡`‡L ZU¯’ _vwK bv\n" +
                "mgy`« R‡j m~‡h©i gZ wbZ¨ A¯—wgZ nB bv!\n" +
                "\n" +
                "Z‡e GZUv `~iZ¡ ‡Kb?\n" +
                "KZUv MR©‡b fiKv‡e Avgvq?\n" +
                "mvM‡iiI mxgvš— Av‡Q;\n" +
                "AvKv‡kiI e¨vwß Av‡Q\n" +
                "Agvem¨vi c‡i c~wY©gv Av‡m|\n" +
                "\n" +
                "mevi D‡aŸ© Avwg ‡Zv bvix!\n" +
                "Avwg AÜKvi c\u00ADve‡bi gy‡L evua mva‡Z cvwi,\n" +
                "weKU MR©‡bi D‡c¶vi kã n‡q\n" +
                "‡Zvgvi welv` wmÜy‡Z we›`y we›`y Abyf~wZi gwYKvÂb‡hv‡M\n" +
                "nvRv‡iv evi M‡o Zyj‡Z cvwi bZyb GK mvMixq mf¨Zv!!\n");
//        ob1.setImgname(R.drawable.cp);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("AZj hvÎv");
        ob2.setDesc("mgy`«‡K e‡jv,ABLv‡b GKUv wefrm ‡`n c‡o Av‡Q\n" +
                "m~h© ‡hfv‡e mgy‡`«i M‡f© nvivq\n" +
                "I GLb ‡mfv‡e R‡ji ey‡K wbwðý n‡e,\n" +
                "Ii Zy‡jvi g‡Zv gb,KwVb ‡Pvqvj,‡gvUv åy,i³‡PvLv `…wó\n" +
                "Avi gy‡L AvwZ¥K ‡e`bvi bxj‡P ‡Qvc me ayuB‡q hv‡e|\n" +
                "\n" +
                "mgy`«‡K e‡jv,ABLv‡b GKUv wefrm ‡`n c‡o Av‡Q,\n" +
                "Ii Pviw`‡K Aa©MwjZ gvsmwcÊ\n" +
                ",nv‡oi k³ c«vPxi|\n" +
                "I imnxb a~ a~ evjyP‡i\n" +
                "‡c«v‰MwZnvwmK hy‡Mi K¼v‡ji fO&¸i Aw¯’ Lywji g‡Zv n‡Z Pvq bv\n" +
                "I ‡dwb‡ji g‡Zv Qwo‡q ‡h‡Z Pvq\n" +
                "I GLb ¯^”Q Rjivwk n‡Z Pvq\n" +
                "I mgy‡`«i AZj MneŸ‡i Wye w`‡Z Pvq|\n" +
                "\n" +
                "mgy`«‡K e‡jv,ABLv‡b Zvi wefrm ‡`n c‡o Av‡Q,\n" +
                "I‡K Avi Gfv‡e ‡dwj‡q ‡i‡Lv bv\n" +
                "I‡K ‡XD‡qi mv‡_ fvwm‡q wb‡q hvI!\n" +
                "‡h eûKvj Av‡MB wb‡R‡K fvmv‡Z ‡P‡q‡Q\n" +
                "‰mK‡Z N~wY©evwji Av¯—i‡Y Pvcv ‡i‡L\n" +
                "Zv‡K Avi c«ZœZ‡Ë&ei mv¶x K‡i ‡i‡Lv bv|");
//        ob2.setImgname(R.drawable.cpp);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("emšÍ eiY");
        ob3.setDesc("G‡m‡Q wd‡i\n" +
                "bZyb my‡ii AvMgbx Mv‡b\n" +
                "Siv cvZvq a~wji Zix\n" +
                "wgwk‡Q wkwki\n" +
                "`xN© wZwgi,\n" +
                "Avi bq `~‡i\n" +
                "ev‡iev‡i `yj‡Q cjøe\n" +
                "`w¶Yv mgx‡i|\n" +
                "I‡i,Avq †Zviv Avq Qy‡U\n" +
                "nj‡` dy‡ji Wvjv‡Z\n" +
                "emšÍ ewi‡Z Avi Kwim bv †`wi|");
//        ob3.setImgname(R.drawable.java);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("Avgv‡`i Mí");
        ob4.setDesc("Avgv‡`i M‡íi ïiæUv\n" +
                "PKLwo‡Z †jLv\n" +
                "‡ek A‡MvQv‡jv\n" +
                "LvwbKUv G‡jv‡g‡jv\n" +
                "‡hb DwY©Rv‡j †gvov‡bv ivdLvZv\n" +
                "Gici..\n" +
                "Aí-¯^í\n" +
                "wKQy Vyb‡Kv Mí\n" +
                "Avi Amgvß †kl cvZv|");
//        ob4.setImgname(R.drawable.php);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("GKvKx‡Z¡i cy‡ivKxwZ©");
        ob5.setDesc("GKvKxZ¡‡K Avwg GKK wkí evwb‡qwQ\n" +
                "‡m wkí `viæY Dc‡fvM¨\n" +
                "LÄi cv‡q bvP‡bIqvjx †m‡R\n" +
                "GjvwqZ fw½‡Z Avgvi ev'cvR‡i b„Z¨ K‡i|\n" +
                "mšÍc‡Y©,kvšÍ ax‡i K¨vP K¨v‡P AvNv‡Zi hš¿Yvq\n" +
                "ï‡f”Qv Rvbvq gvZjZvi mvwbœ‡a¨|\n" +
                "\n" +
                "GKvKxZ¡ Avgvi †mB wkí\n" +
                "hvi Kv‡Q Avwg cª_g †R‡bwQ\n" +
                "‡Zvgvi Avgvi KZ Awgj\n" +
                "GK †giæ,Av‡iK †giæ we¯Íi dvivK!\n" +
                "\n" +
                "GKvKxZ¡ Avgvi bMœ wkniY\n" +
                "hvi i‡Üª i‡Üª kãnxb K_‡cvK_b\n" +
                "GK A‡jŠwKK ¯^‡cœ Mov\n" +
                "‡e`bvi bxjiOv †dwbj|\n" +
                "\n" +
                "GKvKxZ¡ Avgvi Agi m„wó\n" +
                "‡m m„wó‡Z ûUnvU †`Lv †`q\n" +
                "AvKw¯§K am,Mvp dvUj\n" +
                "cybt cybt AvnZ ¶Z †_‡K\n" +
                "Dc‡P c‡i †bvbvRj|\n" +
                "\n" +
                "Avwg Lye K‡i AvM‡j †i‡LwQ\n" +
                "bKkx Kuv_vq gyov‡bv\n" +
                "GK gy‡Vv ¯§…wZi wfZ‡i\n" +
                "Avgvi †mB GKvKx‡Z¡i cy‡ivKxwZ©|");
//        ob5.setImgname(R.drawable.dotnet);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("weR‡qi cZvKv");
        ob6.setDesc("weRq Zywg\n" +
                "bq bqwU gv‡mi ev½vjxi †e`bv,\n" +
                "j¶ cªvY wemR©b,KZ AgvbywlK wbh©vZb\n" +
                "jyÉb,AvnvRvwi,‡ivbvRvwi‡Z nvnvKvi\n" +
                "wK‡kvix,bvix‡`i me©bv‡ki wb`k©b|\n" +
                "weRq Zywg\n" +
                "nvZ cv euvav‡bv hyeK‡`i mvwi\n" +
                "AvKvk evZvm Kvcuv‡bv ivB‡d‡ji aŸwb|\n" +
                "weRq Zywg\n" +
                "¯^vaxbZvi i³¶qx msMªvg,\n" +
                "AvRI cªwZwU †`‡n Av‡ek †`vjv‡bv wmÜ †Qvuqv\n" +
                "evsjvi †`vqvk gvwU‡Z 30j¶ knx‡`i i‡³i NªvY\n" +
                "cªwZwU gyw³Kvgx gvby‡li g‡b wPiA¤øvb|\n" +
                "weRq Zywg\n" +
                "A‡bK Z¨v‡Mi AwR©Z ¯^vaxbZv-\n" +
                "ARmª gv‡qi eyK k~b¨ K‡i nv‡qbv‡`i _vevq\n" +
                "e‡b R½‡j ev mxgvšÍ Icv‡i c‡i _vKv|\n" +
                "weRq Zywg\n" +
                "myß Ny‡g cªwZwU evOvjxi ü`‡q euvwP‡q\n" +
                "bqwU gv‡mi b„ksmZv,AivRKZv,\n" +
                "‰¯^ivPvi‡Z¡i weiæ‡× D¾¡j mv¶x n‡q|\n" +
                "weRq Zywg\n" +
                "k¨gj evsjvi meyR gvV,\n" +
                "230wU b`xi ey‡K fvmv‡bv i³‡mªvZ\n" +
                "mey‡Ri mgv‡iv‡n cªwZwU gvby‡li i³ KYvi jvj e„Ë,\n" +
                "gv_v DuwP‡q `uvwo‡q _vKv jvj-mey‡Ri cZvKv|\n" +
                "weRq Zywg\n" +
                "evsjvi ey‡K DuwP‡q _vKv ¯^vaxb cZvKv,\n" +
                "‡Zvgv‡K GB evsjvi a~wjKYvI fyj‡Z cv‡i bv|\n" +
                "weRq †Zvgv‡K †`‡L Avgiv cvwi\n" +
                "m¤§yLmg‡i hvevi Db¥v` †PZbv,\n" +
                "ZywgB fwel¨r AMªhvÎx‡`i hvÎvi Aby‡cªiYv|\n");
//        ob6.setImgname(R.drawable.wordpress);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("mybxj GLb hv wjL‡Zb");
        ob7.setDesc("‡KD K_v iv‡L wb,¸‡b ¸‡b `y'Uv gvm †K‡U †Mj †KD K_v iv‡L wb\n" +
                "‡m‡Þ¤^‡ii gvSvgvwS‡Z †cuqv‡Ri `vg evo‡jv\n" +
                "‡cªm †eªwds‡q gš¿x e‡jwQj,\n" +
                "GB †Zv Avm‡Q mßvn,‡cuqv‡Ri `vg µq¶gZvq Avm‡e|\n" +
                "Zvici KZ mßvn P‡j †Mj gkvB\n" +
                "wKš‘,mvg‡bi mßvn Av‡m wb|\n" +
                "\n" +
                "GKw`b †gjvq †cªwgKv †cuqvRy †L‡Z †P‡qwQj\n" +
                "Avwg e‡jwQjvg ˆah© ai Rvb!wgqvbgvi †_‡K †cuqvR Avm‡Q e‡j\n" +
                "K'w`b ev‡` `vg K‡g †M‡j\n" +
                "ZLb †cUcy‡i †cuqvRy LvIqv‡ev †Zvgvq!\n" +
                "gvbbxq gš¿x,ej‡Z cv‡ib Avwg Avi KZw`b A‡c¶v Ki‡ev\n" +
                "‡cªwgKv Avgvq †Q‡o †M‡j wK\n" +
                "Avcbvi †cuqv‡Ri `vg Kg‡e??\n" +
                "\n" +
                "‡mw`b evRv‡ii cvk w`‡q wM‡qwQjvg †cªwgKv‡K wb‡q\n" +
                "GK †KwR †cuqvR wK‡b †P‡qwQj †m!\n" +
                "`vg ï‡b j¾vq D‡V G‡mwQjvg\n" +
                "KZ eo‡jv‡Ki †Q‡jiv Avuo‡Pv‡L ZvwK‡qwQj †mw`b\n" +
                "GK †Q‡j 5‡KwR †`wk †cuqvR wb‡q G‡mwQj †cªwgKvi Kv‡Q\n" +
                "‡cªwgKv e‡jwQj,G‡`i †`‡L wKQy wkL!\n" +
                "ï‡bwQ †m †Q‡j †cuqvR e¨vcvix\n" +
                "‡cªwgKv Avi Avgvi w`‡K wd‡iI Pvqwb!\n" +
                "`~i †_‡K e‡jwQjvg,\n" +
                "AvR Zywg 5‡KwR †cuqvR †c‡q Avgvq fy‡j †M‡j\n" +
                "‡`wLI GKw`b AvwgI.......\n" +
                "‡cuqv‡Ri igigv e¨emv Ki‡ev|\n" +
                "‡cªwgKv ZZ¶‡b Ab¨Kv‡iv\n" +
                "‡mB †cuqvR wb‡q †h‡Z cvwi wb AvRI!\n" +
                "\n" +
                "Gi Kw`b c‡i\n" +
                "‡Pv‡Li mvg‡b 1‡KwR †cuqvR awi‡q †cªwgKv e‡jwQj\n" +
                "‡hw`b Avgv‡K Zywg 10‡KwR †cuqvR w`‡Z cvi‡e\n" +
                "‡mw`b AvwgI †Zvgvi n‡ev!\n" +
                "fv‡jvevmvi Rb¨ Avwg †P‡jÄ wb‡qwQjvg mvMª‡n\n" +
                "Gici _‡j nv‡Z Nywi‡qwQ Av¯Í kni\n" +
                "cy‡iv kni Lyu‡R G‡bwQ\n" +
                "108wU †`wk †cuqvR\n" +
                "Zey K_v iv‡Lwb †cªwgKv\n" +
                "GLb Zvi †Pv‡L ïay †cuqv‡Ri †bkv\n" +
                "GLb †m †hb †cuqv‡R gË †cªwgKv\n" +
                "‡KD K_v iv‡L wb!\n" +
                "60 w`b KvUj †KD K_v iv‡L bv|\n");
//        ob7.setImgname(R.drawable.magento);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("LywKi evqbv");
        ob8.setDesc("‡QvÆ LywK evqbv ai‡Q co‡Z em‡e bv,\n" +
                "mKvj-we‡Kj eB co‡Z Zvi fv‡jv jv‡M bv|\n" +
                "\n" +
                "mKvj n‡jB gv‡qi Av‡`k co‡Z em eB Ly‡j,\n" +
                "‡QvÆ gv_vq GZ cov! `yw`b ev‡` hvq fy‡j|\n" +
                "\n" +
                "co‡Z e‡m Avu‡K †m †h dyj-cvwL Avi nvwo,\n" +
                "ai‡j cov cv‡ibv †m Lvq †h †e‡Zi evwi|\n" +
                "\n" +
                "evwi †L‡q eB-LvZv me †`q †m Qy‡o †d‡j,\n" +
                "Mvj dywj‡q Kuv‡` LywK Akªæ †X‡j †X‡j|\n" +
                "\n" +
                "evev G‡m UvKv w`‡q †Kv‡j wb‡j Zy‡j,\n" +
                "Akªæ gy‡Q GKUy nv‡m Kvbœv †m hvq fy‡j|\n" +
                "\n" +
                "we‡Kj †ejv LywKi gv‡q co‡Z emvq hLb,\n" +
                "eÜyiv me †Lj‡Z Wv‡K Kuv‡` LywK ZLb|\n" +
                "\n" +
                "Zv‡`i mv‡_ †Lj‡Z LywKi gb K‡i QUdU,\n" +
                "gv †h Zv‡i AvU‡K iv‡L `uvZ K‡i KUgU|\n" +
                "\n" +
                "em‡e bv AvR co‡Z LywK gv‡qi †Pv‡L w`‡e duvwK,\n" +
                "‡Lj‡e gv‡V g‡bi my‡L ivL‡e bv †m bvP‡Z evwK|\n");
//        ob8.setImgname(R.drawable.shopify);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("g„Z¨y PvB");
        ob9.setDesc("AvwgI ew¼‡gi KgjvKv‡šÍi g‡Zv\n" +
                "‡Mvi¯Ív‡bi Aï_ MvQUvi wb‡P Anwb©k wSgvw”Q\n" +
                "fvewQ ïay ïay Ab_©K †eu‡P AvwQ\n" +
                "Avi gMWv‡ji cªwZwU cvZvq A™¢yZ GK inm¨ †`LwQ\n" +
                "G †Kvb †hb‡Zb fyZy‡o inm¨ bq\n" +
                "Kiæb GK AcªZ¨vwkZ g„Z¨y inm¨\n" +
                "PZyw`©‡Ki G‡Zv G‡Zv Awbqg,\n" +
                "gvby‡l gvby‡l LybvLywb,weev`!\n" +
                "Avi cwÎKvi wk‡ivbv‡g wKQy AbvKvw•¶Z g„Z¨y msev`!\n" +
                "Avgv‡K †gv‡UI wePwjZ K‡i bv\n" +
                "wKš‘,A¯^vfvweK g„Z¨y Avgvq exfrmfv‡e bvov †`q|\n" +
                "Avwg GB g„Z¨yi inm¨‡f` Ki‡Z cvwi bv\n" +
                "wKQy ewjI bv,ïay †P‡q †P‡q †`wL\n" +
                "Avi Avgvi g„Z¨yi c~e©cª¯ÍywZ MªnY Kwi|\n" +
                "ZvB DVv‡bi av‡i eoB MvQUv jvwM‡qwQ\n" +
                "nvZ K‡qK _vb Kvco Avi gkvixUv Zy‡j †i‡LwQ,\n" +
                "Pvi cvqv †PŠwKUvI h‡Zœ †i‡LwQ|\n" +
                "\n" +
                "me‡k‡l GLb AvwgI g„Z¨y PvB\n" +
                "GRb¨B †Mvi¯Ív‡b e‡m cªni ¸bwQ\n" +
                "wKš‘,‡Kvb AbvKvw•¶Z g„Z¨y bv\n" +
                "ïay GKwU ¯^vfvweK g„Z¨y PvB!!\n");
//        ob9.setImgname(R.drawable.angular);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("e„wó n‡ev");
        ob10.setDesc("GB †h †mB ga¨ivZ n‡Z\n" +
                "‡Kgb _g‡K _g‡K Syg e„wó,\n" +
                "GK K`g evB‡i †h‡Z cvi‡Qv bv -\n" +
                "N‡ii AKg©Y¨ e¨w³wUi gZ\n" +
                "KL‡bv †dvb nv‡Z\n" +
                "KL‡bv Rvbvjvi wMª‡j e„wó †`LQ\n" +
                "KL‡bv N‡i-eviv›`vq Ajm cvqPvwi‡Z e¨¯Í|\n" +
                "G‡nb Aweivg ev`j avivq AvKv‡k welbœ e`b\n" +
                "el©Y †`‡L †ZvgviI g‡b welv‡`i NbNUv!!\n" +
                "KB Avgvi †Zv Ggb KZ So-SÅv †Mj\n" +
                "KZevi eyK fvm‡jv cøve‡b\n" +
                "ZLb †Zv Zywg Gfv‡e AvnZ nIwb??\n" +
                "Zv‡e wK †Zvgvi GK AvKvk gb Lvivc †c‡Z\n" +
                "Avwg e„wó n‡ev?\n");
//        ob10.setImgname(R.drawable.python);
        holder.add(ob10);

        Model ob110=new Model();
        ob110.setHeader("C` G‡m‡Q");
        ob110.setDesc("C` G‡m‡Q C` G‡m‡Q\n" +
                "fvm‡Q Lywki evb,\n" +
                "Avcb bx‡o QyU‡Q mevB\n" +
                "g‡b bvwoi Uvb|\n" +
                "\n" +
                "wdi‡Q mevB Muv‡qi c‡_\n" +
                "fi‡Q gv‡qi †Kvj\n" +
                "me eqmx †jv‡Ki ey‡K\n" +
                "ZvB‡Zv Lywki †`vj|\n" +
                "\n" +
                "ev”Pviv me ˆn û‡jøv‡o\n" +
                "mvR‡e C‡`i mvR,\n" +
                "C‡`i bvgvR co‡Z wM‡q\n" +
                "‡f‡O hv‡e jvR|\n" +
                "\n" +
                "eQi Ny‡i GKwU w`‡b\n" +
                "evR‡e mv‡g¨i MxZ,\n" +
                "abx-Mwie GK KvZv‡i\n" +
                "‡bB †h nvi ev wRZ|\n" +
                "\n" +
                "abxiv me nvwm gy‡L\n" +
                "MixeR‡b Ki‡e `vb\n" +
                "Ggb Lywk wbZ¨ bvgyK\n" +
                "cvK wdwi‡q mevB cªvY|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob110);

        Model ob11=new Model();
        ob11.setHeader("gv");
        ob11.setDesc("j¶ †KvwU k‡ãi gv‡S\n" +
                "‡QvÆ kã gv,\n" +
                "¯^M© g‡Z¨© LyuR‡Z †M‡jI\n" +
                "‡bB †h Zvi Dcgv|\n" +
                "\n" +
                "`kwU gvm †c‡U a‡i\n" +
                "mB‡Q KZ hvZbv\n" +
                "mšÍv‡biB gyL †`‡L gv‡q\n" +
                "fy‡j hvq †e`bv|\n" +
                "\n" +
                "gv‡qi †`Lv‡bv cª_g RM‡Z\n" +
                "wkLwQ gv‡qi fvlv\n" +
                "gv‡qi Rb¨ G `ywbqvq\n" +
                "wgU‡Q KZ Avkv|\n" +
                "\n" +
                "AvRI Zey KZ mšÍvb\n" +
                "‡bq bv gv‡qi †LvuR\n" +
                "eQ‡ii GB GKwU w`‡b\n" +
                "Qwe‡Z w`‡”Q †cvR!\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob11);

        Model ob12=new Model();
        ob12.setHeader("Dcjwä");
        ob12.setDesc("Avwg gw¶Kvi b¨vq GK cZ½ !\n" +
                "Af¨vmekZ cªwZwU mKvj iv‡Î\n" +
                "Avw`gZg m¤¢vl‡Y ejZvg \"wcªq\"\n" +
                "Ggb gvayh©nxb Wv‡K Kvi bv Am‡šÍvl nq,ej?\n" +
                "wK kªx nxb Avn¬vw`Z WvK!\n" +
                "AvaywbKZvi hvZvK‡j\n" +
                "Ggb cªvPxb Wv‡K †KD wkK‡j evav _v‡K?\n" +
                "GLb †Zvgvi KwZcq AvaywbK m‡¤^vab\n" +
                "‡Kvb ¶y‡`evZ©v ev wPiKy‡U bq\n" +
                "`y A¶‡ii mij evK¨ bv wfwWI K‡j\n" +
                "ag©xq †Mvovgx‡Z gyL _ye‡o bv †_‡K\n" +
                "AvaywbKZvi AdyišÍ iO g‡Â\n" +
                "weKviMª¯’ †cª‡gi hvZvK‡j\n" +
                "‡Kvb ¯ú‡k© bvB nvZKov|\n" +
                "Avi KÚ‡iva bv gy³ev‡K¨\n" +
                "KvwVb¨ bq Db¥y³ n‡¯Í\n" +
                "cªwgKvi D`vi †`‡n\n" +
                "emvi `~i‡Z¡ †bB GK gnvKvj we¯Íi ïb¨Zv|\n" +
                "ZywgB ej GZ wKQy †i‡L †KD Kvive›`x nq?\n" +
                "mwZ¨B eÇ wb‡e©va Avwg,\n" +
                "GZme †Q‡o wK fv‡eB Zyó n‡e Zywg!\n" +
                "Avwg †Zv Zy”Q gw¶KvB wQjvg\n" +
                "KL‡bv Av‡e`bgqx †cªwgKv wQjvg bv|");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob12);

        Model ob13=new Model();
        ob13.setHeader("KweZv");
        ob13.setDesc("G‡m‡Qv ˆekvL\n" +
                "‡g‡Ni †Kv‡j S‡oi KvRj Gu‡K?\n" +
                "G‡m‡Qv cjøwebx-jZv\n" +
                "Ziæi †Kv‡j kZ j¾v †X‡K|");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob13);

        Model ob14=new Model();
        ob14.setHeader("KweZv");
        ob14.setDesc("‡Zvgvi cy®úKvb‡b Avgvi K›UKkh¨v\n" +
                "Zywg †Zv gvZvj cy®ú †mŠi‡f we‡fvi!\n" +
                "wbZ¨ D‡o D‡o †Zvgvi Kvb‡b\n" +
                "cvcwo Qyu‡q‡Q KZ ci‡`kx †fvgi!\n" +
                "‡m †Qvuqvq Zywg Nb †g‡Ni RgRgvU Ny‡g Av”Qbœ|\n" +
                "Kvbb Ry‡o cªZx¶vq ivZ †k‡li Zvgv‡U †evj,\n" +
                "Gw`‡K Avgvi bq‡b `yw`©b †cvnvevi ¯^cœ!\n" +
                "Avi k¦vc`-msKyj gaye‡b\n" +
                "APjvqZb fvOvi my‡ijv Mvb|\n" +
                "me †Kvjvnj kZ †µvk `~‡i\n" +
                "a~mi w`‡bi wb®úªf cUf~wg‡Z\n" +
                "K›U‡K wQbœwfbœ Avgvi A‡½i emb|\n" +
                "‡Zvgvi IB wb®úªvY J`vm¨,\n" +
                "Avgvi ü`qcy‡ii ˆeivM¨\n" +
                "wbR©xe d¨vKv‡k,cvï‡U gyLfw½‡Z\n" +
                "Avi GKevi †Rvo wgbwZ?\n" +
                "I‡n k¨vg!\n" +
                "Avgvi ¶Zwe¶Z AvZœvi Dc‡i\n" +
                "\"GKUy wK weï× cy®úvÄwj n‡e\"??\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob14);

        Model ob15=new Model();
        ob15.setHeader("KweZv");
        ob15.setDesc("‡Kvb GK Aciv‡ý\n" +
                "Avwg nvZ `ywU evwo‡q\n" +
                "Qv‡`i GK Kvwb©‡k `uvwo‡q|\n" +
                "Avi Ab¨‡Kv‡b _vK‡e c‡i\n" +
                "eB‡qi G‡jv‡g‡jv †Qov cvZv\n" +
                "w¯’i `„wó i‡e ARvbv bxwjgvq,\n" +
                "nVvr-\n" +
                "GKwU wPj hv‡e Dwo‡q\n" +
                "‡i‡L hv‡e Zvi weeY© Qvqv,\n" +
                "ZLwb Rvb‡ev Avwg\n" +
                "GB Vyb‡Kv Rxe‡bi hZ mva\n" +
                "Avi KL‡bv n‡e bv †Zv cvIqv|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob15);

        Model ob16=new Model();
        ob16.setHeader("KweZv");
        ob16.setDesc("Gev‡ii GK ˆP‡Îi we‡K‡j-\n" +
                "‰P‡Îi Db¥v` Kg©Kv‡Ûi wePvimfvq,\n" +
                "`ve`vn cªK„wZ Avi Siv cvZviv †W‡KwQj Avgvq|\n" +
                "AvwgI cªdyjøwP‡Ë AwZw_qZv K‡iwQjvg MªnY|\n" +
                "mfvi gvSc‡_ D_vwcZ nj\n" +
                "eva©‡K¨iZ ˆP‡Îi bv‡g KZ bvwjk,Awf‡hvM\n" +
                "bexb ˆekvL ejj;I‡n cªexY ˆPÎ,\n" +
                "mK‡ji m¤§wZµ‡g ¯^í we¯Íi w`jvg mvRv\n" +
                "Gevi †Zvgvi we`v‡qi cvjv,\n" +
                "GMv‡ivwU gv‡mi Rb¨ w`jvg wbe©vmb\n" +
                "eQi Ny‡i G †`‡k KwiI ågY|\n" +
                "‰P‡Îi we`vqx ï‡b\n" +
                "e‡b e‡b †¯øvMvb w`w”Qj wkgyj,cjvk,K„òKwj,\n" +
                "Avi ˆekvL;\n" +
                "BRviv wb‡qwQj mK‡ji GK †KvwU nvZZvwj|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob16);

        Model ob17=new Model();
        ob17.setHeader("KweZv");
        ob17.setDesc("‡Q‡j †Zvi †Pv‡Li Ky‡oN‡i\n" +
                "‡kl ˆekv‡Li SvcUvNv‡Z,\n" +
                "GKUv `y‡Uv K`g dyU‡e|\n" +
                "gvSiv‡Z †mB K`g Zy‡j\n" +
                "G‡b w`we wK nv‡Z??");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob17);

        Model ob18=new Model();
        ob18.setHeader("KweZv");
        ob18.setDesc("wbe©vKZvq wb”Q myL\n" +
                "Avcb MíUvq|\n" +
                "‡evKv cvwL wkKj c‡i\n" +
                "PycwU K‡i,\n" +
                "Ab¨ Øv‡i\n" +
                "GKjv ai-divq!\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob18);

        Model ob19=new Model();
        ob19.setHeader("KweZv");
        ob19.setDesc("GB †h Avgvi Nyg †f‡O hvq\n" +
                "wbR©b ivwÎi `vo wP‡i\n" +
                "Rvbvjvi †iwjs Qyu‡q\n" +
                "‡PvL Ry‡o hvq †avuqv‡Z|\n" +
                "GB †h kvšÍ w`wNi R‡ji gZ\n" +
                "Do‡Q KZ WvKwU‡KU\n" +
                "me K_viv eyK c‡K‡U\n" +
                "Pyj Qyu‡q hvq wPey‡K|\n" +
                "GB †h †`LwQ †gŠb †Nv‡i\n" +
                "‡Pv‡Li Qvqvi Ky‡oN‡i,\n" +
                "Avwg-Zywg‡Z A‰_ †Ljv\n" +
                "wb¯ÍäZvq fvO‡Q †gjv|\n" +
                "GB †h PjwQ Q‡›`i gZ\n" +
                "Zey my‡ii nvi‡Q †LB\n" +
                "G‡Zv wf‡o mwe Av‡Q\n" +
                "ïay Avcb GKUv\"Zywg\"‡bB|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob19);


        Model ob20=new Model();
        ob20.setHeader("KweZv");
        ob20.setDesc("GB †h G‡Zv bvwj‡ki c‡iI Avwg Avcwb WvwK?\n" +
                "a‡iv,AvR n‡Z †mUv nj e¨w³MZ \"Zywg \"\n" +
                "‡hûZy Avcwb bv \"Zywg\"!!\n" +
                "ZvB hw` GK †fRv †fv‡i evqbv awi\n" +
                "‡hLv‡b Av‡jvi Qovq\n" +
                "AÜKviiv hÁ K‡i,\n" +
                "hvi Zv‡j wek¦PivP‡i\n" +
                "me©v‡½ Av‡jvi evRbv ev‡R\n" +
                "‡mLvb †_‡K GKwU b¶Î G‡b `vI?\n" +
                "ev,‡hLv‡b k•L wPj gy³g‡b\n" +
                "Avcb Zv‡j b„Z¨ K‡i\n" +
                "J AvKv‡ki wmuw_ n‡Z\n" +
                "Avgv‡K GKUv bxj wUc cwi‡q `vI|\n" +
                "Zywg wK Zv cvi‡e??\n" +
                "hw` ewj AÜKv‡ii Zvgv‡U †ev‡j bv\n" +
                "G¶ywb Zš¿mvab K‡i\n" +
                "AvKv‡ki eyK wP‡o\n" +
                "ivZ ¸‡jv‡K K‡i `vI †egvjyg nvIqv!\n" +
                "A_ev †Kvb †gNv”Qbœ iv‡Z\n" +
                "¸‡b ¸‡b mvZkZ cª`xc R¡vwj‡q\n" +
                "GLywb Wv‡Kv Av‡jvi wgwQj|\n" +
                "wKsev ey‡Ki wbf„‡Z ¯’vc‡Z¨\n" +
                "‡g‡Ni cvnvoP~ovq-\n" +
                "b¶‡Îi ˆbm‡M©i ey‡K\n" +
                "‡mLv‡b †g‡Ni giv Lv‡Z cix bvPvI?\n" +
                "AviI hw` evqbv awi?\n" +
                "KweZv wjLvi mva †R‡M‡Q\n" +
                "‡hfv‡eB cv‡iv AvKvk n‡Z\n" +
                "AÄwj‡Z G‡b `vI †dvuUv †dvuUv e„wó\n" +
                "‡KvbUvB wK cvi‡e w`‡Z??\n" +
                "Rvwb,ej‡e wK me Db¥v`bvi KvÛ-KviLvbv!\n" +
                "Av‡`Š †Kvb †cªwgKv Gme †P‡q‡Q wK?\n" +
                "ï‡bv;Zywg eis Avgv‡K GKwU †MvUv AvKvk `vI\n" +
                "G‡ZB Avgvi me evqbv c~Y© n‡e|\n" +
                "hw` GKwU AvKvk `vI;K_v w`jvg\n" +
                "mxgvnxb AvKv‡ki gZ AvwgI †ivR GKwU K‡i KweZv †`e|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob20);


        Model ob21=new Model();
        ob21.setHeader("KweZv");
        ob21.setDesc("nVvr hw` KL‡bv nvwi‡q hvB\n" +
                "ARvbv †KvbLv‡b,\n" +
                "Rvb‡Z B‡”Q Ki‡e Avgvi\n" +
                "Kó cv‡e Kx g‡b|\n" +
                "ZLb Avwg _vK‡ev bv Avi\n" +
                "GB aiYxi ey‡K,\n" +
                "Lyu‡R †eiv‡e Avgvq Zywg\n" +
                "e¨¯Í bMixi duv‡K|\n" +
                "GKUy †`Lvi Avkvq †Zvgvi\n" +
                "gb AvKyj Ki‡e,\n" +
                "Avgvi ivLv me ¯§…wZ wb‡q\n" +
                "c‡_ c‡_ Nyi‡e|\n" +
                "evR‡e Kv‡b Avgvi KÚ¯^i\n" +
                "ev`¨h‡š¿i Zv‡j,\n" +
                "Aweivg Avgvi K_vB Nyi‡e\n" +
                "‡Zvgvi g¯Í‡Ki Rv‡j|\n" +
                "ZLb wPrKvi K‡i DV‡e Zywg\n" +
                "g‡a¨ivwÎ‡Z †R‡M,\n" +
                "Wv‡qwi‡Z jyKv‡bv ï®‹ dy‡j\n" +
                "Avgvi myevm †b‡e|\n" +
                "ev‡iev‡i g‡b co‡e Avgv‡K\n" +
                "‡`qv‡ji QweUvq †P‡q,\n" +
                "Avlv‡pi evwiaviv bvg‡e ZLb\n" +
                "‡Zvgvi `y‡PvL †e‡q|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob21);


        Model ob22=new Model();
        ob22.setHeader("KweZv");
        ob22.setDesc("AvR‡Ki g‡Zv GK kªvšÍ we‡K‡j\n" +
                "AvKvk n‡Z wLjwLwj‡q bvg‡e e„wó †g‡q,\n" +
                "¸o¸o ev`¨-evRbvq\n" +
                "weRjx hv‡e wMªj Qyu‡q|\n" +
                "mv‡_ SwUKv evZv‡mi `j G‡b †`‡e\n" +
                "‡fRv K`‡gi myevm|\n" +
                "Avgv‡K GK Kvc Kwd Avb‡Z e‡j\n" +
                "Zywg GwM‡q hv‡e Rvbvjvi av‡i,\n" +
                "nvZ `ywU‡Z ZLb e„wó †g‡qi bvPvbvwP\n" +
                "‡nW‡dv‡b evRv‡e iex›`ª MxwZ|\n" +
                "me wgwj‡q Avlv‡p e„wói †cª‡g gRby Zywg|\n" +
                "\n" +
                "AvwgI Kwd †i‡L wbðy‡c\n" +
                "Wv‡qwi nv‡Z †ejKwb‡Z\n" +
                "AvKvk‡K wb‡q wjL‡Z em‡ev|\n" +
                "Lye K‡i Rvwb †Zv ;\n" +
                "AvKvk‡K wb‡q †jLv †Zvgvi KZUv Amnbxq!!\n" +
                "Avi,Avgvi AcQ›` e„wó wb‡q gvZvgvwZ|\n" +
                "Gevi `yRb `yRb‡K wb‡q;`y ej‡q `uvwo‡q\n" +
                "ïay †PvLv‡PvwL n‡e!\n" +
                "K_v ejvewj eÜ,\n" +
                "wfZ‡i Pj‡e GK wØgywL kxZj Ø›Ø|\n" +
                "\n" +
                "wgwbU cuv‡PK c‡i\n" +
                "Awfgv‡bi AšÍN©v‡Zi D‡aŸ©\n" +
                "Lyu‡R †`L‡ev AvKvk ev e„wói †P‡q\n" +
                "AvgivB †Zv eo!\n" +
                "Z‡e GZUv `~‡i †Kb??\n" +
                "Ny‡i hvK M‡íi euvK,\n" +
                "AvKvk ev e„wó `~‡iB _vK\n" +
                "‡Kb `~i n‡Z †PvLv‡PvwL??\n" +
                "GB †Zv Zywg-Avwg gy‡LvgywL|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob22);


        Model ob23=new Model();
        ob23.setHeader("KweZv");
        ob23.setDesc("i‡qwQ †c‡Z Kvb\n" +
                "hw` cvB †Zvi Avnevb\n" +
                "Kyqvkvq †Niv cªfvZ gv‡S\n" +
                "nviv‡bv K_v!bZyb myi!\n" +
                "‡g‡N XvKv fi`ycyi|\n" +
                "eywS‡Z cvwi bv wK Rvwb ev‡R nvq\n" +
                "Mx‡Z gyLwiZ cªfvZ‡ejvq\n" +
                "Avcbv‡Z GKMvwQ dyj K‡Y© VuvB jq|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob23);

        Model ob24=new Model();
        ob24.setHeader("KweZv");
        ob24.setDesc("‡kvb bv †Q‡j-\n" +
                "ZyB wK Avgvi †Lvjv Py‡ji RU nwe?\n" +
                "hLb Avwg ivM Ki‡ev\n" +
                "RU †eu‡a gv_vq emwe|\n" +
                "ZyB †Nvi el©vi †gN nwe?\n" +
                "hLb †Zv‡i ci‡e g‡b\n" +
                "ûUnvU wfwR‡q w`we|\n" +
                "I †Q‡j-\n" +
                "ZyB wK Avgvi †fRv kvwoi AvuPj nwe?\n" +
                "KvK †fRv e„wó‡Z,\n" +
                "Mv‡qi mv‡_ †j‡Þ iwe|\n" +
                "‡Q‡j ZyB nwe wK Avgvi cv‡qi b~cyi?\n" +
                "KL‡bv hw` nvwi‡q hvB\n" +
                "ZyBI ZLb weKj nwe|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob24);


        Model ob25=new Model();
        ob25.setHeader("KweZv");
        ob25.setDesc("GL‡bv Aj‡¶¨ A¶xi Pvwiw`‡K\n" +
                "Aweivg Zv‡i Ly‡R wdwi Zx¶è `„wó‡Z,\n" +
                "iv¯Ívi fx‡oi g‡a¨i dvKv UyKy‡Z\n" +
                "ZvwK‡q iB AveQvqv g~wZ©i w`‡K|\n" +
                "Kv‡iv Pj‡b-ej‡b g‡b c‡i Zv‡i,\n" +
                "gy‡Li Aembœ GK‡N‡q fveUv D‡V †e‡o|\n" +
                "KL‡bv †jvK-‡jvKviY¨ wcQ‡b †d‡j,\n" +
                "DrmyK Zx¶è †Pv‡L Acivaxi Qvc I‡V dy‡U|\n" +
                "we›`y we›`y Nv‡g gyLLvbv I‡V †b‡q,\n" +
                "Aeva¨ fvix nvZUv ax‡i ax‡i †m Nvg gy‡Q|\n" +
                "Avev‡iv AbymÜvby cv `ywU P‡j Qy‡U,\n" +
                "‡Kvb RUjv †`L‡j MwZ wbðj n‡q hvq †_‡g|\n" +
                "g‡b nq Gevi †`Lv †c‡qwQ Zv‡i\n" +
                "‡Wvev †Pv‡L ¯^”Q D`vi nvwmi wSwjK D‡V †R‡M|\n" +
                "Qvqvc‡_i me Av‡jv cybivq wg_¨vq f‡i,\n" +
                "AvkvnZ PIov gyLUv‡K Zy‡j wb®úªvb K‡i|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob25);

        Model ob26=new Model();
        ob26.setHeader("KweZv");
        ob26.setDesc("GLb †Zvgvi `y‡PvL Qvwc‡q Rj‡mªvZ eB‡Q?\n" +
                "DB‡cvKvq †L‡q‡Q Rj AvUKv‡bvi †ewoeuva!\n" +
                "‡Pv‡Li eviv›`v †e‡q bvg‡Q †m Abvwej †mªvZ\n" +
                "Kuv‡`v hZ cv‡iv Kuv‡`v\n" +
                "G wb‡q †bB †Kvb bvwj‡ki †fRv ev·!\n" +
                "Kuv‡`v hZUv cv‡iv\n" +
                "‡Ku‡` †Ku‡` wb‡R‡K K‡iv ¶q,\n" +
                "nq‡Zv G Kvbœv mn‡RB †kl nevi bq|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob26);


        Model ob27=new Model();
        ob27.setHeader("KweZv");
        ob27.setDesc("A‡bKw`b a‡i GKUv K_v ejvi wQj,\n" +
                "nq‡Zv †m my‡hvM G‡mwQj wKsev Av‡mwb\n" +
                "AvR †kl g~û‡Z© Z‡e e‡jB †dwj?\n" +
                "Rv‡bb;Avwg GK gnvcvcx,\n" +
                "AevK n‡”Qb?\n" +
                "Z‡e mv`vgvUvfv‡eB ewj\n" +
                "GLb Avgvi AšÍ‡i Mvp Kj‡¼i `vM\n" +
                "Ggb wKQy n‡Zv bv\n" +
                "hw` ¯^cœv‡jv‡K Rvbv †hZ\n" +
                "Avcbvi gvqvi Qvqvq Rov‡bvI G‡Zv cvc|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob27);


        Model ob28=new Model();
        ob28.setHeader("KweZv");
        ob28.setDesc("AwPb GK Zvivi †`‡k\n" +
                "gb Lviv‡ci bvg‡Q AmyL,\n" +
                "GKUy hw` Av½yj †e‡o\n" +
                "Zvivi †Qvuqvq †cZvg myL!\n" +
                "\n" +
                "\n" +
                "\n" +
                "GBLv‡b GB R‡ji av‡i\n" +
                "‡Zvgvi Avgvi mL¨,\n" +
                "GBLv‡b GB wKbvivq\n" +
                "fvOvMovi AvKyjZvq;\n" +
                "A‡bK K_vB A`„k¨!!\n" +
                "\n" +
                "\n" +
                "\n" +
                "wKQy Awfgvb\n" +
                "wKQy Ae¨³ K_vi fxo\n" +
                "wKQy jy‡KvPywi ¯^cœ,\n" +
                "fv‡jvevmv mvgvb¨\n" +
                "Avi,Avgvi GKjv bxo!!\n" +
                "\n" +
                "\n" +
                "\n" +
                "cy‡owQ Avwg\n" +
                "‡j‡M‡Q †gv‡gi AvuP,\n" +
                "‡Zvi bv‡gB wj‡L w`jvg\n" +
                "Avgvi hZ gb Lvivc|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob28);


        Model ob29=new Model();
        ob29.setHeader("KweZv");
        ob29.setDesc("mg‡qi †L‡ivLvZvq Avwg GK wPwýZ gvbex\n" +
                "Zv‡mi evwÛj †_‡K Qy‡o †djv †Kvb GK †RvKv‡ii Zvm,\n" +
                "Avwg mg‡qi cwiµgvq wejyß wPwV\n" +
                "Avi †kliv‡Z R¡jv †mB Aby¾¡j ZviKvwU|\n" +
                "\n" +
                "ZeyI wK Rvwb †f‡e G‡mwQj A‡b‡K\n" +
                "Zviv †KD KL‡bv Lyu‡R cvBwb bvMvj\n" +
                "Zvici `ªæZgqx mg‡qi me †k‡l\n" +
                "G‡K G‡K ¸b‡Z nq GK A‡nZyK wn‡me!\n" +
                "Gici †_‡K Avgvi ey‡K ¯^cœ †bB\n" +
                "‡Kvb †Kvb iv‡Z †bB AÜKvi\n" +
                "GB †h G‡Zv G‡Zv wn‡me!\n" +
                "Avi †Pv‡Li wKbvivq †njvq KvUv‡bv `„wócvZ|\n" +
                "Zey wKwÂr K¬vwšÍ †bB\n" +
                "hvq hw` Ggwb K‡iB mnmª iRbx †K‡U hvK\n" +
                "Zviv ¸b‡Z ¸b‡Z n‡q hvK mKvj\n" +
                "G‡ZB hw` nq AšÍ‡ii mv‡_ AšÍ‡ii bvMvj|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob29);


        Model ob30=new Model();
        ob30.setHeader("KweZv");
        ob30.setDesc("Avgvi `yqv‡i †`LwQ Zv‡i\n" +
                "ej‡Z cviwQ bv K_v\n" +
                "‡bvbv R‡j fvO‡Q †h Ni\n" +
                "euva w`‡q n‡e Ah_v??");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob30);


        Model ob31=new Model();
        ob31.setHeader("KweZv");
        ob31.setDesc("GK gnvKvj †Ku‡`wQj Awbe©vY\n" +
                "fy‡jI †`‡Lwb †Kn...\n" +
                "GKw`b R¡‡jwQj ey‡Ki R¡vjvq\n" +
                "AvR Zvi ke`vn|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob31);

        Model ob32=new Model();
        ob32.setHeader("KweZv");
        ob32.setDesc("Avgvi g‡bi k¨vIjv cov †`qv‡j\n" +
                "wKQy AMfxi Awfgv‡bi ¶Z\n" +
                "Avi wKwÂr Zy‡jvay‡bv ivM\n" +
                "Abyf~wZiv Zey fxlY wbR©xe\n" +
                "nq‡Zv cªPÛ fv‡jvevmv gy‡L ejv AcivM!!");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob32);


        Model ob33=new Model();
        ob33.setHeader("KweZv");
        ob33.setDesc("Kó †`e bv e‡jB\n" +
                "`~‡i G‡m\n" +
                "Kó w`‡qwQ †Zv‡K!\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob33);

        Model ob34=new Model();
        ob34.setHeader("KweZv");
        ob34.setDesc("Avwg bv nq e„wó fv‡jvevwm\n" +
                "ZvB e‡j GZ e„wó n‡Z n‡e?\n" +
                "GB †`L AvwgI †hb Av¯Í Wy‡e hvw”Q\n" +
                "GKUy †Zvgvi a~wji kn‡i G‡m\n" +
                "GKgy‡Vv e„wó wb‡q Avgvq D×vi K‡iv †Zv!");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob34);


        Model ob35=new Model();
        ob35.setHeader("KweZv");
        ob35.setDesc("i‡Oi †gjvi n‡iK mv‡R\n" +
                "fxlY ¯^cœvjy †Zvgvi †PvL\n" +
                "\n" +
                "bvUvB Nywoi †Qov my‡Zvq\n" +
                "GKjv Avgvi evo‡Q †ivM|");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob35);


        Model ob36=new Model();
        ob36.setHeader("KweZv");
        ob36.setDesc("Amxg k~b¨Zvi PivP‡i\n" +
                "Avgvi AvKvk ZyB,\n" +
                "e„wó‡e‡k\n" +
                "Avgvi\n" +
                "‡`‡k\n" +
                "bvg‡j †Zv‡i QyuB|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob36);



        Model ob37=new Model();
        ob37.setHeader("KweZv");
        ob37.setDesc("hZUv gy‡LvgywL\n" +
                "AZUvB `~‡i\n" +
                "Rj‡Kwj‡Z †LjwQ\n" +
                "`c©‡b AvuKwQ\n" +
                "gb cvov‡Z WvKwQ Nyg,\n" +
                "‡RvbvK †cvKvi\n" +
                "QUvK Av‡jvq\n" +
                "fMœ my‡ii evR‡jv ayg|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob37);

        Model ob38=new Model();
        ob38.setHeader("KweZv");
        ob38.setDesc("GB GKwesk kZvãxi Z„Zxq `k‡Ki\n" +
                "Kwd kc,‡i÷y‡i›U wKsev cv‡K©i Mwji hyMj‡`i\n" +
                "Avwg µgk wbe©vKwP‡Ë †`LwQ\n" +
                "wK wbuLyZ K¨vbfv‡m...\n" +
                "Ny‡b aiv m¤ú‡K©i KwoKv‡Vi Aa© †PŠKv‡Vi\n" +
                "AvjKvZivi cyiæ ¯Íi †f` K‡i\n" +
                "‡cªwgK-‡cªwgKvi ü`wcÐ wbtm„Z\n" +
                "Qjbvi †dvuUv †dvuUv i³ PyuB‡q co‡Q\n" +
                "cªwZwU AmZ¨ wbtk¦v‡m,\n" +
                "K¨vKUv‡mi KvUv‡Quov cvZvi g‡Zv\n" +
                "µg ewa©òy D”PZvq\n" +
                "Zy‡jvay‡bv †mB K„wÎg fv‡jvevmv\n" +
                "B‡Ui cuvRi wQ‡o wQ‡o\n" +
                "welv³ aywji g‡Zv Dwo‡q †eov‡”Q\n" +
                "Awek¦v‡mi GB APxb kn‡i|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob38);

        Model ob39=new Model();
        ob39.setHeader("KweZv");
        ob39.setDesc("‡Zvgvi Rb¨\n" +
                "GB †j‡Þ hvIqv Mvp KvRj\n" +
                "GKgy‡Vv fv½v Kv‡Pi Pywo\n" +
                "A‡MvQv‡jv †Lvjv Pyj\n" +
                "Avi †mvbvwj cv‡oi jvj kvwo|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob39);

        Model ob40=new Model();
        ob40.setHeader("KweZv");
        ob40.setDesc("cª‡qvR‡b KvUvZvi n‡q\n" +
                "k¦vmbvjx we× K‡iv\n" +
                "wKš‘,\n" +
                "ev cvRi gyP‡o †ei nIqv\n" +
                "`xN©k¦vm nBI bv!\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob40);

        Model ob41=new Model();
        ob41.setHeader("KweZv");
        ob41.setDesc("‡ek fv‡jv AvwQ......\n" +
                "Dlvi Av‡jvi ivOv cªn‡ii\n" +
                "GB cwiwPZ nvwmB mv¶x!");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob41);

        Model ob42=new Model();
        ob42.setHeader("KweZv");
        ob42.setDesc("GB‡Zv Lye Kv‡Q\n" +
                "AvR‡Ki GB Kyu‡o Avwg\n" +
                "ARv‡šÍB nvwi‡q hv‡ev....\n" +
                "`viæY e¨¯ÍZvi ARynv‡Z|");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob42);


        Model ob43=new Model();
        ob43.setHeader("KweZv");
        ob43.setDesc("GB g~wZ© Avgvi A‡`Lv bq\n" +
                "ARvbv bq Gi Mnx‡bi Avùvjb\n" +
                "Av‡jv Zvi fvix M¤¢xi\n" +
                "‡K G‡m R¡vjv‡e †Zvib??");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob43);


        Model ob44=new Model();
        ob44.setHeader("KweZv");
        ob44.setDesc("Avwg ivwR,ai‡Z nvRv‡iv evRx\n" +
                "Zywg AvM‡j iv‡Lv hw`,\n" +
                "A¯ÍPuv‡` KvUv‡ev Rxeb\n" +
                "nI hw` Lye Avcb\n" +
                "Ki‡j g‡bi Miv‡` ew›`|");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob44);


        Model ob45=new Model();
        ob45.setHeader("KweZv");
        ob45.setDesc("KweZv †Zv‡i w`jvg †X‡j\n" +
                "nvwm gvLv dy‡j,\n" +
                "GK ARjv myLI w`jvg\n" +
                "jjv‡U wbm Zy‡j|");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob45);


        Model ob46=new Model();
        ob46.setHeader("KweZv");
        ob46.setDesc("KweZv!!! Zywg †cªwgK nI\n" +
                "‰¯^ivPvix kvmK nBI bv......");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob46);

        Model ob47=new Model();
        ob47.setHeader("KweZv");
        ob47.setDesc("GKUv cvwL Rb¥ †_‡KB Do‡Q\n" +
                "e‡b-ev`‡o,bx‡j......AvKvk Ry‡o \n" +
                "cvj‡K,Wvbvq Zvi Dc‡P IVv isevnvi|\n" +
                "Avi GK AvKvk ¯^vaxbZv\n" +
                "GKw`b mÜ¨v †k‡l,AvKvk cv‡b\n" +
                "ïKZvivwUi †Mvcb Wv‡K\n" +
                "Do‡Z †Mj AviI...\n" +
                "Dc‡i ZviI Dc‡i,\n" +
                "nVvr wcQb wd‡i\n" +
                "‡Nvi fvO‡jv Avavi †`‡L....\n" +
                "ej nviv‡jv,is nviv‡jv\n" +
                "bvMvj †cj bv Kv‡iv, \n" +
                "ïKZvivwU evnev w`‡jv\n" +
                "‡Zvgv‡Z ab¨ njvg AviI...\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob47);

        Model ob48=new Model();
        ob48.setHeader("KweZv");
        ob48.setDesc("‡Zvgvi Rb¨ mKvj, `ycyi \n" +
                "‡Zvgvi Rb¨ mÜ¨v \n" +
                "‡Zvgvi Rb¨ mKj †Mvjvc \n" +
                "Ges iRbxMÜv|");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob48);

        Model ob49=new Model();
        ob49.setHeader("emšÍ eiY");
        ob49.setDesc("G‡m‡Q wd‡i\n" +
                "bZyb my‡ii AvMgbx Mv‡b\n" +
                "Siv cvZvq a~wji Zix\n" +
                "wgwk‡Q wkwki\n" +
                "`xN© wZwgi,\n" +
                "Avi bq `~‡i\n" +
                "ev‡iev‡i `yj‡Q cjøe \n" +
                "`w¶Yv mgx‡i|\n" +
                "I‡i,Avq †Zviv Avq Qy‡U \n" +
                "nj‡` dy‡ji Wvjv‡Z\n" +
                "emšÍ ewi‡Z Avi Kwim bv †`wi|\n");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob49);

        Model ob50=new Model();
        ob50.setHeader("KweZv");
        ob50.setDesc("Z„òvq k¦vm iæ× n‡q Avm‡Q\n" +
                "‡Zvgv‡K †`Lvi Z„òv.....!!");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob50);


        Model ob51=new Model();
        ob51.setHeader("KweZv");
        ob51.setDesc("jvM‡Q gvZvj nvIqv \n" +
                "Py‡j‡Z `xN©k¦vm,\n" +
                "‡Zvi bv‡g BRviv w`jvg\n" +
                "Avgvi hZ Djøvm|");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob51);


        Model ob52=new Model();
        ob52.setHeader("KweZv");
        ob52.setDesc("e„wó eybU Kwdi †avuqvq \n" +
                "Qy‡U hv‡”Q Nyg,\n" +
                "Iô evovI,wdwi‡q bvI\n" +
                "hvhvei †Vvu‡Ui Pyg|");
//        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob52);


//        Model ob50=new Model();
//        ob50.setHeader("KweZv");
//        ob50.setDesc("");
////        ob11.setImgname(R.drawable.nodejs);
//        holder.add(ob50);



        return holder;
    }


}
