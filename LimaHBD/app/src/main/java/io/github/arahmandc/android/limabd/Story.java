package io.github.arahmandc.android.limabd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Story extends AppCompatActivity {
    RecyclerView rcv;
    adaptermy adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        rcv = (RecyclerView) findViewById(R.id.recviews);

        adapter = new adaptermy(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rcv.setLayoutManager(linearLayoutManager);

    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("c‡U AvuKv fv‡jvevmv");
        ob1.setDesc("cªwZw`‡bi g‡Zv AvR‡KI mKv‡ji bv¯Ív †m‡i wiKkv wb‡Z M¨v‡i‡R Av‡m Av°vm Avjx|\n" +
                "ew¯Í †_‡K †ei nIqvi c‡iB\n" +
                "Ab¨w`‡bi †P‡q AvR‡Ki kn‡ii Avjv`v mvR Zvi bR‡i c‡i|AvR kniRy‡o gvbe †Rvovi gnv m‡¤§jb e‡m‡Q e‡j Zvi g‡b nq|fvwm©wU coyqv †Q‡j †g‡qiv †_‡K ïiæ K‡i,ev”Pv mn myLx `¤úwZ ev DVwZ eqmx †Q‡j †g‡qiv wb‡R‡`i g‡a¨ g‡bi wgj †i‡L GKB i‡Oi †Wª‡m †hb †mB gnvm‡¤§j‡bi Avgwš¿Z AwZw_|A‡bK †g‡qiv n‡iK iK‡gi dy‡ji Sywo gv_vq Avi iwOb kvwo c‡o †Kvb GK hye‡Ki k³ nv‡Zi eÜ‡b GwM‡q Pj‡Q wb‡R‡`i MšÍ‡e¨|cªwZwU kn‡i Gme AwZ mvaviY `„k¨ n‡jI m`¨ Mªvg †_‡K Avmv Av°vm AvR Ab¨ †KŠZyn‡j ZvwK‡q _v‡K|\n" +
                "M¨v‡iR †_‡K †PŠiv¯Ívq Avm‡ZB GK †Rvov hyeK hyeZx kni Nyi‡Z hv‡e e‡j Zvi wiKkv fvov K‡i|Pj‡Z Pj‡Z wiKkvq Av‡ivnx‡`i g‡a¨Kvi K_vq †m eyS‡Z cv‡i AvR‡K fv‡jvevmv w`em|G w`e‡m gvbyl Rb Zv‡`i wcªqRb‡`i fv‡jvevmvi K_v Rvbvq,wb‡R‡`i g‡a¨ fv‡jvevmv Av`vb cª`vb K‡i,`yRb `y Rbv‡K wewfbœ Dcnvi †`q,wb‡R‡`i cQ‡›`i RvqMv¸‡jv‡Z Nyi‡Z hvq Ggb AviI KZ wK!\n" +
                "Av°vm Pvicv‡ki cwi‡ek †`‡L Avi wew¯§Z n‡q Zv‡`i K_v ï‡b|Kíbvq ew¯Íi †QvÆ Sycwoi Aa© †bvsiv Kvc‡o †MŠi e‡Y©i KwP †eŠ‡qi gyLwU Zvi †Pv‡L †f‡m D‡V|Mªv‡g e„× evev gv Avi wb‡Ri Afv‡ei msmv‡i we‡qi `yB eQ‡i †eŠ‡K wKQy k‡Li wRwbm w`‡Z cviv ev cªvq GK eQ‡ii kû‡i Rxe‡bi †Kvbw`b Gfv‡e wiKkvq K‡i cy‡iv kn‡i Ny‡i Avb›` wejvm Kivi †mŠfvM¨ Zvi nq wb|\n" +
                "AvR mevi g‡Zv wb‡Ri †eŠ‡KI GKMvwQ Mv`v †Lvucvq ¸‡R w`‡Z Zvi Lye B‡”Q nq|\n" +
                "\n" +
                "Avi me w`‡bi †P‡q AvR‡K hvÎx †ewk nIqvq Av°vm `ycy‡i evwo wdi‡Z cv‡i bv|ivZ `kUv ch©šÍ †m cªvq ev‡iv'k UvKv †ivRMvi K‡i|hv Ab¨w`‡bi †P‡q wZb¸b †ewk|AvR‡K fv‡jvevmv w`em e‡jB nq‡Zv gvbyl nvwmgy‡L Avmj fvovi †P‡q †ewk w`w”Qj|mvivw`b wiKkv Pvwj‡q K¬všÍ n‡jI †gvUv As‡Ki †ivRMv‡i w`b‡k‡l Zvi gy‡L w¯§Z nvwmi Avfv dy‡U|M¨v‡i‡Ri gvwjK‡K nvwRiv †kva K‡i evwK UvKv‡Z †m GKUv jvj †Mvjvc,evmšÍx i‡Oi GKUv †mvbvjx cv‡o kvwo,K‡qKUv PK‡jU Avi GKUv gvSvwi g‡Zv gvQ wb‡q evwo wd‡i|\n" +
                "evwo‡Z wdi‡j Zvi †eŠ MvgQv nv‡Z D‡Vv‡b Avm‡j gvQ †`‡L Lywk‡Z AvZœnviv nq|‡eŠwU gvQ ivbœv Ki‡Z †M‡j †m evwK Dcnvi¸‡jv N‡ii GK †KvYvq jywK‡q †i‡L †`q|`y'R‡b wg‡j LvIqvi mgq A‡bKw`b c‡i †m Av`i K‡i †eŠ‡K wbR nv‡Z Zy‡j fvZ LvB‡q †`q|‡eŠwU cª_‡g AevK n‡q wKQyUv ms‡KvP Avi j¾vq c‡o hvq|wKš‘,c‡i ¶‡YB ¯^vfvweK fw½‡Z wb‡RI ¯^vgxi gy‡L fvZ Zy‡j †`q|wbwg‡lB Zv‡`i †QvÆ KyVywi‡Z †hb ¯^M©xq kvwšÍi myevm I‡V|eûw`b c‡i `y'R‡bi †Pv‡L gy‡L iv‡R¨i Z„wß †XD †L‡j|\n" +
                "LvIqv ce© †k‡l Av°vm †eŠ‡qi †Lvucvq †MvjvcUv ¸‡R †`q|kvwoUv co‡j A‡bK w`b c‡i †m gb f‡i `y'bq‡b †eŠ‡K †`‡L|Afv‡ei hvZvK‡j †cvov gwjb †Pnvivi †eŠwU‡K Zvi †Pv‡L fv‡jv kvwo Avi GKUv jvj †Mvjv‡c ivRivbxi †P‡q †Kvb As‡k Kg jv‡M bv|\n" +
                "\n" +
                "`y'nv‡Z †eŠ‡qi Mjv Rwo‡q Av‡e‡M M`M` K‡Ú †m e‡j,\"\n" +
                "AvBR bvwK fv‡jvevmv w`em wQj ZvB fv‡jv KvgvB nB‡Q|AvBR mevB KZ wKQy Ki‡Q|AvwgI †Zv †Zv‡i eûZ fv‡jvevwm †eŠ|GB Rb¨ †Zv‡i w`‡Z fv‡jv‡e‡m GB kvwoUv AvbwQ|Avgvi Qv-‡cvlv †ivRMv‡i †Zv‡i †Kvbw`b kn‡ii †Kv_vI Nyi‡Z wb‡q †h‡Z cvwi bvB|\n" +
                "Kvj‡K †Zv‡i wiKkvq K‡i kni †`Lv‡Z wb‡q hvgy|ZyB wK Avgvi m‡½ hvwe?\"");
        ob1.setImgname(R.drawable.st01);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("A‡c¶v");
        ob2.setDesc("kn‡ii †kl gv_vi †gvo †_‡K mvg‡b evov‡bv `xN©w`b †_‡K †givg‡Zi Afv‡e RivRxY© iv¯ÍvUv †ij †÷k‡bi w`‡K GwM‡q †M‡Q †mB †÷k‡bi hvÎx QvDwb †_‡K mvgvb¨ `~‡i †h eU MvQwU Av‡Q Zvi Zjvq lv‡Uva© AÜ †jvKwU‡K cªwZw`b GKBfv‡e †`Lv hvq|\n" +
                "wekvj Rbmgy‡`ªi Kg©e¨¯Ígq GB †÷k‡b †jvKwU‡K †Zgb †KD f&iæ‡¶c K‡i bv ej‡jB P‡j|ZeyI eQ‡ii ci eQi wVK GKB RvqMvq GKBfv‡e †jvKUv‡K †`Lv hvq|wKš‘, †mB wbðyc †jvKwU‡K †KD K_v ej‡Z †`‡L bv|nq‡Zv GB wecyj Rb‡mªv‡Zi bvbvwea K‡jøvjaŸwb †m cig AvMª‡n Db¥yL n‡q †kv‡b|RxY©kxY© †ivMv kix‡i eoeo ¶Z wPý mv‡_ kvixwiK cªwZeÜKZv Avi †Qov Aa© gqjv cvÄvexB Zvi AmnvqZ¡ cªgvY K‡i|‡÷k‡b wbqwgZ Avmv hvÎx‡`i GK iKg cwiwPZ gyL ejv hvq|MvQ Zjvi Qvqvq GKUv Aa© †bvsiv P‡Ui e¯Ívq emv †jvKwU‡K †`‡L A‡b‡KB AbyMª‡ni e‡m `y `k UvKv Qy‡o †`q|w`b‡k‡l e¯ÍvUvi mvg‡b †`o `y‡kv LyPiv UvKv I †iRwKi †`Lv †g‡j|Aciv‡ý m~h© cwð‡g X‡j hvq!mvivw`‡bi Rgv‡bv mÂq AvuK‡o a‡i †jvKwU ggZv gvLv‡bv GK‡Rvov big nv‡Zi A‡c¶vq _v‡K|\n" +
                "\n" +
                "AZtci KL‡bv D¾¡j †iŠ‡`ªi,KL‡bv †gNjv Avi KL‡bv KL‡bv Kyqvkv †Niv mÜ¨v bv‡g|Avi †mB mÜ¨v bvgvi c‡i c‡iB `ywU †Kvgj nvZ G‡m Zvi kxY©Kvq nvZ `y‡Uv a‡i †÷k‡bi wecixZw`‡K jvB‡bi av‡ii cøvw÷‡Ki †QvÆ Sycwo NiUvq wb‡q hvq|\n" +
                "Ab¨vb¨ w`‡bi g‡Zv †mw`b mKv‡jI fimvi †mB nvZ `ywU G‡m †÷k‡b †i‡L hvq|‡mw`‡bi mÂq ¸wU‡q †jvKwU Db¥yL Avi DrKÚv wb‡q †mB big nvZ `ywU Avi mvivw`‡bi †Kvjvnj †_‡K GKUy wb¯ÍäZvi A‡c¶vq _v‡K|wVK KZ mgq P‡j hvq Zv †m eyS‡Z cv‡i bv|nq‡Zv Nwoi KuvUv evisevi Zvi Pµ cwieZ©b K‡i|ax‡i ax‡i †mB wekvj Rbmgy‡`ªi cv‡qi AvIqvR gš’i n‡q Av‡m|cªvb PÂj †÷kbwU wbwg‡lB †hb GK e„nr giæf~wg‡Z iƒc †bq|G‡K G‡K nvwi‡q †h‡Z _v‡K †÷k‡bi n‡iK iK‡gi kã|ïay Kv‡bi c`©vq †Rv‡i av°v †`Iqvi g‡Zv ¯úó LyeB my¯úó n‡q D‡V iv‡Zi †Uª‡b¸‡jvi SbSbvwb|c‡i¶‡YB cy‡iv cø¨vUd‡g© Pvcv GK wb¯ÍäZv Mªvm K‡i|‡mB cªvYnxb g„Z¨ycyix‡Z †jvKwU GKBfv‡e Vuvq e‡m _v‡K|mgq Zvi MwZ‡ZB P‡j wKš‘ †mw`b Avi †Kvb ggZv fiv nvZ Qyu‡q w`‡Z Av‡m bv|\n" +
                "\n" +
                "AvKw¯§K GK †Nv‡ii g‡a¨ wKfv‡e ivZ †K‡U Dlv nq †jvKwU Zv eyS‡ZB cv‡i bv|wbZ¨ w`‡bi Af¨vm g‡Zv eU Mv‡Qi Kv‡Ûi †dvuK‡i _vKv cvL-cvLvwjiv AveviI wKwPiwgwP‡i Wvbv SvcUv‡bvq Zv‡`i Kvh©w`em ïiæ K‡i|ZZ¶‡Y m~h©I M‡e©i mv‡_ Zvi wSwj‡K c„w_ex Av‡jvwKZ K‡i|AwP‡iB Kg©PÂj n‡q D‡V iv‡Zi †mB wb¯Íä †÷kbwU|GZw`b ¯^-B‡”Qq wbðyc _vKv †jvKwU †mw`b ivZfi DrKÚv Avi ¶yavi Zvobvq mwZ¨ mwZ¨B †hb K_v nvwi‡q †d‡j|µgk †ejv evo‡Z _v‡K|‡mw`b mKv‡j memgq A‡MvP‡i _vKv †mB †jvKwUi †Pv‡L A‡b‡KB cvwb †`‡L|mviviv‡Zi Abvnv‡i †ewk K‡i KyK‡o hvIqv f½yi †`n †`‡L †KD †KD Avi w`‡bi †P‡q `y‡Uv UvKv †ewk Qy‡o †`q|\n" +
                "mgq evovi mv‡_ mv‡_ †÷kb Ry‡o e¨¯ÍZv ev‡o mv‡_ mgvb Zv‡j Pj‡Z _v‡K PZyw`©‡Ki Rbv mgvM‡gi DËvj K_vi †XD|Z‡e,‡mw`b GKUv K_v eû K‡Ú A‡bKevi Zvi Kv‡b av°v †`q|GZw`b †Zv Ggb K‡i †KD K_v ejZ bv!AÜ †jvKUv ïb¨ D`‡i welbœ g‡bI wew¯§Z n‡q ïb‡Z _v‡K|ax‡i ax‡i K_v¸‡jv ¯úó n‡q Zvi Kv‡b ev‡R|‡÷k‡b hvIqv Avmv Kiv mK‡ji gy‡L\"AvR mKv‡j †÷kb †_‡K GK wK‡jvwgUvi `~‡ii eo cyKy‡i †÷k‡bi eQi we‡k‡Ki †Kvb GK ew¯Íi †g‡qi wQbœwfbœ †`n †f‡m Av‡Q\"GB GKUv K_vB †jvKwUi Kv‡b †f‡m av°v †`q|GZ¶‡Y G‡Zv G‡Zv K‡Úi GB K‡jøvjaŸwb Zvi Kv‡Q wbwg‡lB cwi®‹vi n‡q D‡V|Amnvq †mB A¶g †jvKwU wbe©vK wP‡Ë †P‡q _v‡K!nq‡Zv AÜ‡Z¡i Rb¨ wb‡Ri †g‡q‡K †m †Pv‡Li †`Lvq †`‡L wb|wKš‘,w`b‡k‡l ïaygvÎ †mB wbf©i GK †Rvov nvZ Zv‡K wVKB Avcb K‡i Lyu‡R wbZ|\n" +
                "‡m ey‡S †bq Avi †Kvbw`b †mB †Kvgj nvZ `ywU cig †mœ‡n evev e‡j Zv‡K LvB‡q †`‡e bv,wb‡Ri †kl Aw¯ÍZ¡ ch©šÍ GB †÷k‡b wVK GKBfv‡e A‡c¶vq _vK‡jI Zv‡K †KD wb‡Z Avm‡e bv|Zvi †g‡qwU wb‡Ri Aw¯ÍZ¡ wU‡K ivLvi jovB‡q KvR †_‡K wdi‡Z nv‡qbvi Là‡i c‡i ewj`vb n‡q‡Q!wKš‘,GLb Zvi\n" +
                "Aw¯ÍZ¡ msK‡Ui cošÍ †ejvq gyP‡o IVv AšÍ‡ii AšÍN©vZ †_‡K GZw`b wbðyc _vKv †jvKwU ARv‡šÍB wPrKvi K‡i gvwU‡Z gv_v Ky‡o!!gyn~‡Z©B wbweo ¯ÍäZvq _g‡K I‡V cy‡iv †÷kb|‡KD †KD AwZ AvMª‡n `ycv GwM‡q Av‡m|cªkœ‡evaK †Pv‡L Zviv G‡K Ac‡ii w`‡K †P‡q †`‡L|‡jvKwU Dcyo n‡q wVK †Zgwb K‡iB AùyU¯^‡i †MvOv‡Z _v‡K|µgkB RbmgvMg evo‡Z _v‡K|Avevi ¶vwbK c‡iB wg‡k hvq|Gfv‡e Nwoi KvUvi mv‡_ PµvKv‡i Ny‡i Av‡m †Uªb|‡÷kb Ry‡o G‡Zv G‡Zv gvbyl Av‡m hvq wKš‘ †KD Zvi Aw¯Í‡Z¡i msKUgq gg©e¨_vUv KL‡bvB Rvb‡Z cv‡i bv.........!!\n" +
                "\n" +
                "FZyP‡µ Mªx®§,el©v,kxZ Av‡m hvq|‡Pv‡Li cj‡KB cvj‡U hvq KZwKQy|ïay cv‡ë bv †jvKwUi RxebPµ!‡mw`‡bi ci †_‡K †jvKwU ivZw`b A¯^vfvweKfv‡e †mB GKB RvqMvq GKBfv‡e c‡o _v‡K|Ah‡Zœ KOvjmvi †`n †`‡L †jv‡K GLb Zv‡K †ewk K‡i UvKv Qy‡o †`q|wKš‘,mÜ¨v bvgvi c‡i `ywU wbf©iZvi nv‡Zi †Qvuqv †c‡Z mvivw`‡bi Rgv‡bv mÂq †m GLb Avi AvuK‡o a‡i bv|‡evanq †m K_v ej‡ZB fy‡j †M‡Q|‡÷k‡bi †UvKvB †Q‡jiv wKQy G‡b †`q ZvB †L‡q g‡iI †eu‡P Av‡Q| †m nq‡Zv †mB GK †Rvov wbf©iZvi nv‡Zi A‡c¶vq Ggwb K‡iB wb‡Ri Aw¯ÍZ¡ wU‡K ivL‡Q|nq‡Zv Zvi wU‡K _vKvi jovB‡qi g~jgš¿B n‡jv AšÍi †_‡K MwjZ †mB big `ywU nv‡Zi †mœn,ggZv wgwkªZ fv‡jvevmvi †Qvuqv Avi ZviB A‡c¶vq †eu‡P _vKv! ........");
        ob2.setImgname(R.drawable.st02);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("bvqK †_ivwc");
        ob3.setDesc("‡mw`b gv‡K A‡bK mr mvnm wb‡q e‡jwQjvg hZw`b Iiv _v‡K ZZw`b Avwg Avi eo Lvjv¤§vi evwo‡Z hv‡ev bv|\n" +
                "Iiv †K †i?Kvi K_v ejwQm?Ggb cª‡kœ wRnŸvq Kvgo c‡iwQj|‡Kvb iK‡g Ab¨ GKUv cªm½ †U‡b K_vUv Gwo‡q †MwQjvg|\n" +
                "Rvwb gv bv‡Qvoev›`v!G‡Zv mn‡R Qvovi gwnjv bv|‡h‡Z hLb ej‡Q ZLb nvRviUv mgm¨v _vK‡jI †h‡ZB nZ|\n" +
                "Aek¨ gv‡m `yGKevi eo Lvjv¤§vi evwo †h‡Z AvgviI fv‡jv jvM‡Zv|G‡Z we‡kl K‡i Lvjv‡Zv †evb †Kqvi mv‡_ †`Lv nZ|‡Kqv‡K †mB †QvU‡ejv †_‡KB A‡bK cQ›` KiZvg|ZvB,ZLb †Kqvi Rb¨ n‡jI bvbv DwQjvq I‡`i evwo hvIqv †hZ|wKš‘,‡hw`b †_‡K †Kqv I‡`i G‡bwQj Ges Avwg nvgjvi wkKvi n‡qwQjvg †mw`b †_‡K I‡`i evwo †h‡Z eyK KuvcZ|GB GKUv Kvi‡YB †Kqv‡`i evwo hvIqv euva †m‡RwQj|\n" +
                "wKš‘,RvbZvg Avgvi bv hvIqvi KviY gv ïb‡jB ej‡e,ZyB †Rvqvb †Q‡j bv Kvcyil!I‡`i‡K evwoi mvg‡b †`‡LB f‡q †`Šo w`m!ZyB †h GKUv †Q‡j †mUv †Zvi mvn‡m cªgvY KB?nv‡Z Pywo c‡i N‡i e‡m _vK BZ¨vw` BZ¨vw`!!\n" +
                "GZme Acgvb mn¨ Ki‡Z cvie bv e‡jB gv‡K Avmj inm¨Uv ej‡Z cvwiwb|GB K_v †Kqv‡K ej‡Z †M‡j †mI wZwiswewis K‡i evwo ï× Qwo‡q †`Iqvi k¼v wQj|Zvi †P‡q eis Avgvi mgm¨v Avgvi Kv‡Q _vKvB fv‡jv|\n" +
                "gv‡qi †`Iqv Zvj wc‡V wb‡q Pvcv GKUv fq wb‡q †mw`b we‡K‡j †Kqv‡`i evwo‡Z iIbv w`‡qwQjvg|cyKyi cvo ch©šÍ I‡`i KvD‡K †`L‡Z cvBwb|\n" +
                "hvK AvR‡K Avi †Kvb nvgjvi wkKvi †_‡K †eu‡P †Mjvg †f‡e g‡b g‡b `iæ` ciwQjvg|‡Kqv‡K WvK‡Z Lvjv¤§v wfZ‡i Avm‡Z ej‡jb|\n" +
                "wKš‘,wewaevg!`iRv Ly‡j wfZ‡i XyK‡Z AvKw¯§K f¨vuev‡PKv LvB|GKev‡i Iiv mevB wPrKvi K‡i D‡V Zvig‡a¨ Pvi Rb Avgv‡K AvµgY K‡i|‡Kqv N‡ii evB‡i G‡m Avgvi GB Ae¯’v †`‡L Avgv‡K bv Qvwo‡q I wK bv †n‡mB Lyb|\n" +
                "Ii mvg‡b Ggb Ae¯’vq c‡i j¾vq Avgvi gv_v †nU nIqvi `kv n‡qwQj!I wb‡P †b‡g G‡m I‡`i‡K `yi`yi K‡i Zvwo‡q †`q|mv‡_ Avgv‡K eywS‡q †`q Iiv gv_v wbPy K‡i AvUK Ki‡Z Avm‡j †hb f‡q †Rv‡i bv †`ŠovB|\n" +
                "\n" +
                "‡mw`b Avwg mvgvb¨ Kv‡iv Rb¨ wf‡jb nIqvi j¾vq A‡bK w`b I‡`i evwo‡Z hvB wb|‡mRb¨ Avgv‡K evievi AvUK Kiv †Kqvi †mB bvqK‡`i gy‡LvgywL nIqvi k¼vI wQj bv|ï‡bwQ †Kqvi bvq‡Kiv GLb I‡`i evwo‡Z bvB|wKš‘,AvcœvivI Rv‡bb bv †K wQj †mB bv‡q‡Kiv?Avwg evievi hv‡`i nvgjvi wkKvi n‡qwQ?Avm‡j,Iiv k‡Li e‡k †Kbv †Kqvi ivRnuvm wQj|hviv I‡`i evwo‡Z cª‡ek Kivi c‡_ bvqK e‡b wM‡qwQj Avi Avwg †mB nZfvM¨ wf‡jb †h wK bv evievi †_ivwc †L‡qwQ|\n");
        ob3.setImgname(R.drawable.st03);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("‡cuqvR");
        ob4.setDesc("Avwg GKwU \"‡cuqvR\"|n¨vu,Avgvi bvg ï‡b P¶y PivK MvQ nIqv,Le‡ii KvMR,‡Uwjwfk‡bi wk‡ivbvg,G mg‡qi †dmeyK Kvcuv‡bv,e¨emvqxi nvwm gyL Avi mvaviY †µvZv‡`i gwjb gy‡Li KviY nIqv Avwg †mB †mwj‡eªwU †cuqvR|AvR‡K Avwg Avgvi I Avgvi RvwZ‡Mvôxi A‡bK ejv bv ejv AvZœKvwnbx Avgvi GB Wv‡qwi‡Z wjLwQ|ïiæ‡ZB ewj †mB cªvPxbKvj †_‡KB Avgiv G‡`‡ki gvby‡li cwiwPZ gyL|Kv‡ji weeZ©‡b wewfbœ Kv‡R Avgv‡`i nuvK WvK †hgb †e‡o‡Q †Zgwb K‡g‡Q|wKQyw`b Av‡MI wewfbœ †iv‡Mi cªv_wgK wPwKrmvq mevi Av‡M Avgv‡`i †LvuR Kiv nZ|wKš‘,wPwKrmv weÁv‡bi DbœwZi mv‡_ Avgv‡`i Rxebgvb K‡g Avi Ae‡njv evo‡Z _v‡K|\n" +
                "\n" +
                "ZeyI,Avgv‡`i Abycw¯’wZ‡Z †¯úkvj wKQy ¯^v`nxb|Avgiv Qvov Mªv‡gi K„lK‡`i cvšÍvi _vjvwU gjxb|Avgv‡`i mvnvh¨ Qvov gwnjv‡`i ivbœvNiUv †hgb Am¤ú~Y©|‡Zgwb Avgv‡`i ms¯úk© Qvov ivbœv ¯^v`nxb|‡Uwjwfk‡bi wewfbœ ivbœvi Abyôv‡b Lvevi mvf© Kivi †cø‡U Avgiv G‡KKRb wgm Iqv‡ì©i g‡Wj wn‡m‡e f~wgKv cvjb K‡i _vwK|ZvQvov,‡g‡q‡`i Pyj e„w×‡Z ev LykwK wb‡iva‡b Avgv‡`i ¸Yv¸Y †bv‡ej cvIqvi †hvM¨Zv iv‡L|AwZ †ivgvw›UK †cªwgK-‡cªwgKviv Avgv‡`i Pvgovi is‡qi mv‡_ hLb †Vvu‡Ui Zyjbv K‡i ZLb M‡e© Avgv‡`i †cU dy‡j D‡V|Avgv‡`i Me© Kivi g‡Zv Ggb nvRvi nvRvi D`vniY Lye mn‡RB †`Iqv hvq|Z‡e,‡Kvb we‡kl Abyôv‡b Avgv‡`i wbwe©Pv‡i wba‡bi mgq Avgiv cªwZev` Ki‡Z cvwi bv|wKš‘,A‡b‡Ki bv‡Ki Rj Avi †Pv‡Li Rj GK Kiv‡bvi GK A`„k¨ cªwZ‡kva †bIqv‡Z Avgv‡`i Rywi †gjv‡bv fvo|\n" +
                "\n" +
                "Z‡e,`yt‡Li welq n‡jv Avgiv †`kxq n‡jI KL‡bv GKK ivRZ¡ Ki‡Z cvwiwb|Avgv‡`i cªwZ‡ekx wn‡m‡e fviZxq‡`i Avbv‡Mvbv †ewk!cª‡qvR‡bi LvwZ‡i evwYR¨ Pyw³i gva¨‡g mxgvšÍ †cwi‡q Uªv‡K Uªv‡K Zviv G‡`‡k G‡m Avgv‡`i‡K cªwZ‡hvwMZvq †d‡j †`q|Avgv‡`i Zyjbvq Zviv †ewk my`k©b,AvKv‡i eo I GKUy `vg Kg nIqvq KL‡bv Zv‡`i Pvwn`vB †ewk nq|A‡bK Ajm gwnjviv mgq euvPv‡bvi Rb¨ ¯^vgx‡K Ab¨‡`i Avb‡Z e‡j|\n" +
                "Avgv‡`i †Zgb we‡`k ågY Kiv bv n‡jI †`‡ki Af¨šÍ‡iB GLv‡b ILv‡b Avmv hvIqv Ki‡Z Ki‡Z AwZ my›`i †Kvgj nvjKv jvj †Mvjvwc Pvgovq Qvj D‡V KZ ai‡bi †h `vM c‡o Zvi BqËv bvB|AwZwi³ Rvwb©‡Z A‡b‡Ki RxebvemvbI n‡q hvq|GQvov, wbZ¨w`b evRv‡i KZR‡bi †h jvw_ ¸‡Zv †L‡q wU‡K _vK‡Z nq Zv †Kej AvgivB Rvwb|\n" +
                "\n" +
                "wKš‘,GLb Avgv‡`i Av‡Mi g‡Zv wbh©vZb Kivi my‡hvM bvB|Avgiv †KD‡qB Kv‡iv Kv‡Q Avi Ae‡nwjZ bv|K„lK,e¨emvqx,‡µvZv mevi Kv‡Q Avgiv iZœLwbi g‡Zv!MZ Kw`‡bB Avgv‡`i K`i eû¸b †e‡o‡Q|‡hB Avgv‡`i Kv‡iv Mv †_‡K GKUy SuvSv‡jv MÜ †ei n‡jB †KD wKb‡Z PvBZ bv|AveR©bv ¯Í~‡c VuvB n‡Zv †mB Avgv‡`i GLb Av`i Avc¨vq‡bi KgwZ †bB|Avgiv GLb Us‡qi Pv‡qi †`vKvb †_‡K ïiæ K‡i wUwf UK †kv Avi cªwZwU Le‡ii KvM‡Ri wk‡ivbv‡g|\n" +
                "Av‡M A‡bK mgq Avgv‡`i gvwj‡Ki gjxb gyL _vK‡jI GLb hvi Aax‡b Avgiv hZ‡ewk AvwQ Zvi gy‡Li nvwm ZZ‡ewk cªk¯Í|cªwZwU †`vKv‡bi `„wó AvKl©‡Yi †K›`ªwe›`y‡Z Avgv‡`i bvg|A‡bK eo‡jvKivI GLb Avgv‡`i w`‡K ZvKv‡bvi mvnm cvq bv|A‡b‡K Avgv‡`i `i ï‡b KvPygvPy K‡i k~b¨ nv‡Z wd‡i Av‡m|wKsev,Av‡M hviv e¨vM fwZ© K‡i evmvq Avb‡Zv †m †jv‡Ki e¨v‡Mi Zjvi cwjw_‡b Avgv‡`i nv‡Z‡Mvbv KRb‡K †`Lv hvq|\n" +
                "‡`vKvb`viiv Avgv‡`i Avi †Z‡j Wywe‡q gPg‡P wcqvRy e‡j LÏi WvKvi mvnm cvq bv|\n" +
                "‡gvMjvB c‡ivUv‡Z Avgv‡`i ev` w`‡q KuvPv †c‡c,‡QvU jvD w`‡qB A‡bK †nv‡U‡ji gvwjK Pvwj‡q †`q|\n" +
                "cªwZwU e¨emvqxB GLb wb‡Ri mšÍv‡bi †P‡q Avgv‡`i †ewk Av`i hZœ K‡i|Avgv‡`i hv‡Z †Kvb ai‡bi Ace¨envi bv nq †m e¨vcv‡i M„nKZ©viv wb‡Ri eD‡`i evisevi mZK© K‡i|me‡P‡q eo I Avkvi K_v n‡jv †h,MZKvj †_‡K †`LwQ wek¦we`¨vj‡qi A‡bK wk¶v_x© cov‡kvbv ev` w`‡q Avgv‡`i wb‡q msmvi Pvjv‡e e‡j wm×všÍ wb‡”Q|‡jvKgy‡L ïbjvg,‡mw`b GK my›`ix †g‡qi we‡qi mg‡Ü †Q‡j bvmvi M‡elK ï‡bI †g‡qi evev ivwR nqwb|wKš‘,‡hB ïb‡Q †Q‡j Avgv‡`i e¨emv K‡i †mB †g‡qi evev ivwR n‡q hvq|Gme Aek¨B Avgv‡`i evowZ cvIqv|\n" +
                "ZvQvovI,Avgv‡`i cªwZ‡ekxiv c~Rv Dcj‡¶ Bwjk Dcnvi †c‡q †m¸‡jv ivbœv Kivq Zv‡`i `iKvi †e‡o †M‡Q|GLb Avgv‡`i cªwZ‡ekxiv G‡`‡k Avm‡Z bv cvivq Avgiv Avgv‡`i nviv‡bv HwZn¨ wd‡i †c‡Z PjwQ mv‡_ AvcvZZ nVvr †m‡jweªwU n‡q mevi G‡Zv G‡Zv K`i mvMª‡n Dc‡fvM KiwQ|\n");
        ob4.setImgname(R.drawable.st04);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("e„×vkª‡g GKw`b");
        ob5.setDesc("Avwg †ckvq GKRb mvsevw`KKg©x|mvsevw`KZvi my‡Î cªvq cªwZw`b †`‡ki wewfbœ RvqMvq wM‡q bvbv ¯Í‡ii gvby‡li KvR n‡Z wi‡cvU© msMªn Kiv jv‡M|wVK †Zgwb Gev‡ii C`yj AvRnv wb‡q GKwU wi‡cvU© Ki‡Z XvKvi GK e„×vkª‡g wM‡qwQjvg ৷\n" +
                "\n" +
                "g~jZ,Gev‡ii cªwZ‡e`‡b Avgvi welqe¯Íy wQj e„×vkª‡gi K‡qKRb e„×-e„×vi nvwm-Kvbœv,‡d‡j Avmv cwievimn C‡`i ¯§…wZPviY Gme wb‡q mv¶vrKvi †bIqv৷\n" +
                "\n" +
                "c‡iiw`b mKvj 10Uv bvMv` †mB e„×vkª‡g †Mjvg|mvg‡bi eo †MUUv †cwi‡q eviv›`vi mvg‡b †h‡ZB GK lv‡Uva© e„×vi †`Lv|‡gvUvgywU GKUv mv¶vrKvi wb‡Z e„×vi mv‡_ cwiwPZ n‡q Rvbjvg e„×vi bvg nvwg`v †eMg|\n" +
                "\n" +
                "K_vq K_vq Rvbjvg nvwg`v †eM‡gi ¯^vgx GKRb mvgvb¨ †eZ‡bi miKvwi PvKyixRxwe wQ‡jb|PvKywii myweav‡_© d¨vwgwj wb‡q cyivb XvKvi m¯Ív GK d¬&hv‡U _vK‡Zb|2‡Q‡j GK †g‡qi g‡a¨ hLb eo †Q‡j †Mv‡ìb G+ wb‡q GmGmwm cvm Kivi c‡i Zv‡K †`‡ki bvgKiv fvj GKwU K‡j‡R fwZ© Kivb৷c‡ii eQi 2q †Q‡j‡KI GKB K‡j‡R fwZ© Kivb|evmv Kv‡Q n‡jI cov‡kvbvi myweavi Rb¨ 2 †Q‡jB †mLv‡b evmv fvov wb‡q _vK‡Zv|\n" +
                "\n" +
                "Zv‡`i eo †Q‡j bvw`g mvBÝ †_‡K GBPGmwmi c‡i †gwW‡K‡j PvÝ bv cvIqvq XvKv fvwm©wU‡Z fwZ© nq৷hLb n‡Z 2‡Q‡j evB‡i _vKv ïiæ Ki‡jv ZLb n‡Z †jLvcovi LiP eve` Zv‡`i‡K cªwZgv‡m cªvq 18 nvRvi UvKv w`‡Z nZ৷‡g‡qUv ZLb K¬vm wm‡· _vKvq Ii wcQ‡b LiP Kg nZ|\n" +
                "\n" +
                "‡QvU †Q‡j nvwg` †ek mÂqx wQj| I †Zgb †ewnmvwe LiP Ki‡Zv bv|K‡j‡R 2q e‡l© DVvi c‡i †_‡K wb‡Ri cov‡kvbvi cvkvcvwk †m wUDkwb KiZ|wKš‘,bvwdm AwgZe¨qx nIqvq evÜy‡`i mv‡_ A‡nZyK UvKv e¨q Ki‡Zv|\n" +
                "\n" +
                "hw`I bvw`g †QvU‡ejv n‡ZB †ek GK‡ivLv,‡Rw`,wKQyUv AnsKvix wQj ZeyI bvw`‡gi cªwZ Zvi evevi fv‡jvevmv †ewk wQj|wZwb Me©‡eva K‡i ej‡Zb,Zvi †Q‡j †`‡ki †miv fvwm©wU‡Z co‡Q|wKš‘,GKw`b K‡jR †_‡K evmv Avmvi mgq moK `yN©Ubvq nvwg` ¸iæZi AvnZ nq|7w`b AvBwmBD‡Z wPwKrmvi c‡i gviv hvq|GB e‡j nvwg`v †eMg †Ku‡` DV‡jb|\n" +
                "\n" +
                "nvjKv †giæb i‡Oi m¯Ív cv‡oi kvwoi AvuPj w`‡q †PvL gy‡Q Avevi ejv ïiæ Ki‡jb|Gw`‡K †g‡qUv eo nw”Qj GKUv ga¨ggv‡bi N‡i we‡q w`‡Z †M‡jI mÂ‡qi `iKvi wQj| ZvB,Ii evev GK †`vKv‡bi wnmve †`Lv-‡kvbvi Ifvi UvBg KvR Kiv ïiæ K‡i|cwikª‡gi gvÎv evwo‡q w`j|w`bw`b ïwK‡q hvw”Qj|ZeyI Ii K_v,Ò‡Q‡jUvi †cQ‡b LiP n‡”Q Avevi †g‡q we‡q w`‡Z n‡e GL‡bB wKQy mÂq Kwi|Zvi Dci,K'eQi ev‡`B wiUvqvW© Ki‡Z n‡e|\"\n" +
                "\n" +
                "‡Q‡ji wk¶vRxeb †kl n‡q hvq|Gw`‡K †g‡qI B›UviwgwW‡qU cvk K‡i|Z‡Zvw`‡b bvw`‡gi evev iæMœ n‡q †M‡Q৷Wvqv‡ewUm mn bvbv eva©K¨RwbZ †ivM aiv c‡o|wiUvqvW© nIqvi c‡i XvKv †Q‡o Mªv‡gi evwo gvwbKM‡Ä P‡j hvB|wKQyw`b c‡i\n" +
                "GK cªevmx m¤£všÍ N‡ii †Q‡j‡K †`‡L †g‡qi we‡q †`B|K‡qK gvm ev‡` †g‡q‡K RvgvB we‡`k wb‡q hvq|Iw`‡K bvwdm KvbvWvq wcGBPwW Ki‡Z hvq|c‡i ïwb †m †Kvb GK abxi `yjvjxi †cª‡g c‡o‡Q|‡mB †g‡qi LiPvq KvbvWv hvq৷hvevi Av‡M evwo‡Z `yw`b †_‡K we`vq wb‡qwQ‡jv|wcGBPwW †k‡l I‡`‡k Av‡iv `yeQi _vKvi c‡i †`‡k Av‡m৷‡Q‡j GLb A‡bK eo BwÄwbqvi,bZyb d¬&hvU wb‡q _v‡K|\n" +
                "\n" +
                "cª_g cª_g gv‡m GK wK `yevi †dvb w`‡q †LvuR Lei wbZ|Zv‡K †dvb w`‡j †ewkifvMB eÜ †`LvZ|KviY Rvb‡Z PvB‡j Lye e¨¯Í _vwK e‡j †K‡U †`q৷bvwd‡mi evev †Q‡ji Ggb KvÛ-KviLvbvi Rb¨ wfZ‡i wfZ‡i Kó †c‡Zb|‡Kvb †Kvb w`b iv‡Z Nygv‡bvi Av‡M Kvbœv Ki‡Zv৷evievi ej‡Zb,Òhv‡K wb‡q GZ ¯^cœ †`Ljvg ¯^cœUv c~iY wVKB n‡jv wKš‘ Zv‡K nvwi‡q †djjvg!\"\n" +
                "\n" +
                "we‡qi c‡i evB‡i wM‡q cª_g Qqgvm †g‡qUv Avgv‡`i msmv‡ii LiP en‡bi Rb¨ wKQy K‡i UvKv cvVv‡Zv|wKš‘,RvgvBUv hLb †R‡b †Mj ZLb †m Avi UvKv cvVv‡Z cvi‡jv bv|Gme wb‡q cwiev‡i bvbv Sv‡gjv nZ|c‡i eva¨ n‡q wm×všÍ †bq UvKv cvVv‡e bv!Gw`‡K bvw`‡gi evev Wvqv‡ewU‡mi cªfv‡e †Pv‡Li `„wókw³ A‡bKUv nvwi‡q †d‡jb৷Dbvi KvR Kivi gZ †Kvb kw³ wQj bv|\n" +
                "\n" +
                "‡klch©šÍ Avgv‡`i `ytwe©ln w`b cvi n‡Z jvM‡jv|‡g‡qUv bvw`g‡K Avgv‡`i K_v e‡jwQj|GKw`b †Q‡jUv Avgv‡`i XvKvq wb‡q Av‡m৷bvw`g †h we‡q K‡i‡Q Avgiv RvbZvg bv৷‡m Avgv‡`i‡K Rvbv‡bvi `iKviI g‡b Kwiwb|GLv‡b G‡m Zvi evwo‡Z gvÎ 7Uv w`b wQjvg৷ZvI Zvi `~im¤ú‡K©i AvZ¥xq wn‡m‡e!\n" +
                "\n" +
                "Zvici †Q‡jUv Avgv‡`i `yRb‡K e„×vkª‡g iv‡L!Avgv‡`i Rxe‡bi me‡P‡q eo cyi¯‹viUvB †`q৷‡hUv Avgiv nq‡Zv fy‡jI PvBwb!AvR †QvU †Q‡j nvwg` _vK‡j nq‡Zv Avgv‡`i w`bUv Ab¨iKg n‡jI cvi‡Zv|\n" +
                "\n" +
                "GKivk `xN©k¦vm †Q‡o nvwg`v †eMg e‡j mvsevw`K evev,\"GB †h †`‡Lv Avwg GB BU wm‡g‡›Ui N‡i e‡m AvwQ৷d¨v‡bi cvLv †Nv‡i memgq৷mßv‡n GKw`b Miæi †MvkZ LvB৷wb‡Ri myL,`yt‡Li K_v ej‡Z KZ Rb‡K cvB|A‡bK my‡LB †Zv AvwQ৷‡Q‡j †Zv Avgv‡`i fv‡jv Pvq e‡jB GLv‡b †i‡L †M‡Q,ZvB bv evev?\"\n" +
                "\n" +
                "nvwg`v †eM‡gi †PvL Qvwc‡q Rj Mwo‡q c‡o৷hLbB Av‡iv K‡qK †dvuUv Rj Mwo‡q co‡e ZLbB kvwoi AvuPj w`‡q gy‡Q †d‡jb!\n" +
                "Gici wKQy¶b bxie _v‡Kb৷`xN©k¦vm †d‡j ej‡jb,wKš‘ Kó †h Ggb myL bvw`‡gi evevi †ewkw`b Kcv‡j mB‡jv bv|gvbylUv GLv‡b Avmvi GK eQ‡ii g‡a¨B gviv †M‡jb!\n" +
                "\n" +
                "Avev‡iv Uc Uc K‡i cov †bvbvRj AvPuj w`‡q w`‡q gy‡Q wb‡q ej‡jb,\"Rv‡bv,evev!Avgiv Avgv‡`i †Q‡j‡g‡q‡`i Lye fv‡jv evmZvg|wb‡Ri m‡e©v”P w`‡q Zv‡`i Lywk ivLvi †Póv KiZvg|GK C‡` I‡`i `y-fvB‡qi K‡j‡Ri dg© wdjv‡ci Rb¨ Lye Avw_©K Uvbv‡cvov PjwQj|Zvi Dci bvw`‡gi evqbv Zv‡K kwcs‡qi Rb¨ 10 nvRvi Avi Zvi eÜy‡`i mv‡_ Nyi‡Z hvIqvi Rb¨ 20nvRvi UvKv w`‡Z n‡e|Dcvq bv †c‡q Ii evev GK eÜyi KvQ n‡Z UvKv avi †bq|evwKUv wb‡Ri cvÄvex,cvRvgv Avi Pkgv †Kbvi Rb¨ ivLv UvKvUv w`‡q 30 nvRvi c~Y© K‡i †Q‡j‡K †`q|avi bv K‡i Avgvi Mjvi nviUv wewµ Kivi Rb¨ A‡bK ejwQjvg gvbylUv ZvI ï‡bwb|Zywg Rv‡bv,12eQi eq‡m GKevi bvw`‡gi UvBd‡qW n‡qwQj|‡Q‡jUv R¡‡ii †Nv‡i cªjvc eK‡Zv|Avgv‡K Rwo‡q a‡i w`b ivZ Kuv`‡Zv|wZbw`b a‡i Ii Kv‡Q ivZ †R‡M †k‡l AvwgI Amy‡L cwi|my¯’ n‡Z gvmLv‡bK mgq jv‡M|\n" +
                "\n" +
                "Avj‡Zv K‡i †Pv‡Li cvwb gy‡Q ej‡jb,‡m K_v hvK evev!\n" +
                "GLv‡b ivLvi c‡i cªvq cªwZ C‡` G‡m 2/1Uv `vgx kvwo Avi wKQy djg~j wb‡q G‡m †`Lv K‡i †hZ|wek¦vm K‡iv evev,Ii `vgx kvwo‡Z Avgvi †jvf wQj bv|wKš‘,Ii †Pnvivq Avgvi fxlY †jvf wQj|I G‡j B‡”Q Ki‡Zv ey‡K Rwo‡q a‡i Av`i Kwi|wKš‘,Zv wK Avi GLb nq!!`~i †_‡KB Ii †mB †Kvgj gyLUvq Avgvi †QvÆ bvw`g‡K †`L‡Z †cZvg G‡ZB gbUv fv‡jv nZ|ï‡bwQ bvw`g cªwZeQi 4Uv Miæ Kyievwb K‡i iv¯Ívi gvbyl‡`i `vb K‡i|Gev‡ii Kyievwbi C‡` mvivw`b A‡c¶vq wQjvg GB eywS †Q‡jUv wUwdbev‡· ivbœv Kiv Kyievbxi †MvkZ Avi iæwU wb‡q Avm‡e|A‡bKw`b n‡jv Pv‡ji iæwUi mv‡_ Miæi †MvkZ LvIqv nq bv|wKš‘,bv mÜ¨v †cwi‡q ivZ n‡jI †Q‡jUv Avi Av‡m wb|‡mw`‡bi ivZUv wKfv‡e †K‡U‡Q Zv GKgvÎ AvwgB Rvwb evev e‡jB ûû K‡i Kvbœv Ry‡o w`j|\n" +
                "GKUy †_‡g Avevi ej‡jb,\n" +
                "ïbwQ wKQyw`b Av‡M Avgvi GK dyUdy‡U bvwZ n‡q‡Q|Gevi †Zv Zvn‡j bvw`g †Q‡j wb‡q A‡bK e¨¯Í wQj|‡cvovgb ZvI gv‡b bv evev!Avi,w`b †nvK ev bv †nvK †Q‡jUvi gyL †`L‡ev e‡j eQ‡ii GB `yB C‡` PvZ‡Ki g‡Zv w`b ¸wb|w`b¸‡jv †mB w`bB Av‡Q evev|ïay Avgvi †Q‡jUvB cvj‡U †M‡Q|‡m K_v Qv‡ov,GLv‡b †ek fv‡jvB †Zv AvwQ|cªwZw`b bvgv‡R †Q‡jUv Avgvi my‡L-kvwšÍ‡Z _vKyK †m †`vqvB Kwi evev|\"\n" +
                "G K_v e‡j nvwg`v †eMg N‡ii w`‡K cv evov‡jv|Avi,Avwg wKsKZ©e¨wegyp n‡q Dbvi P‡j hvIqv †`Ljvg|Mv‡j nvZ w`‡q †`wL GK ARvbv Kvi‡Y Mvj `ywU wm³|\n" +
                "bv †mw`b Avwg Avi wØZxq Kv‡iv Revbew›` wb‡q wi‡cvU© †kl Ki‡Z cvwi wb|\n" +
                "\n" +
                "e„×vkª‡gi GB GKw`bB wQj Avgvi Rxe‡bi me‡P‡q eo wk¶v|Rxe‡bi D_vb cZ‡b A‡bKwKQy fyj‡Z cvwi wKšÍ\"e„×vkª‡g GKw`b\"‡m K_v nq‡Zv AvgiY fyj‡Z cvi‡ev bv!\n");
        ob5.setImgname(R.drawable.st05);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("‡ev‡bi C` wMdU");
        ob6.setDesc("Gevi wUDkwbi UvKvUv †`wi‡Z †`Iqvq Av‡Mfv‡MB C` kwcs Ki‡Z hv‡ev e‡jI Avi hvIqv n‡q D‡Vwb|hw`I C‡`i Kov evRv‡ii `v‡gi Zyjbvq Avgvi ev‡R‡Ui cwigvY hrmvgvb¨|Zey,gvwbe¨v‡Mi †Kvbvq UvKvUv wb‡q A‡bK Avkvq eyK †eu‡a we‡Kj PviUv bvMv` †ei njvg|Av‡M n‡ZB cwiKíbv wQj Gevi cvÄvex wKb‡ev wK wKb‡evB|Rb¥MZfv‡e cvÄvexi Dci Avgvi GKUv Avjv`v Uvb Av‡Q|GUv wVK g‡bi Uvb bvwK AvZœvi Uvb †mUv Aek¨ fvebvi welq|Zv hvB‡nvK,kwcsg‡j Xy‡K cvÄvex †`Lv ïiæ KiwQ Ggb mgq †`wL Avgvi wVK mvg‡bB GKUv †g‡q Lye g‡bv‡hv‡Mi mv‡_ GKUy K‡i nvU‡Q Avi G‡Ki ci GK cvÄvex †`L‡Z‡Q|Avmvi ci n‡ZB †g‡qUvi mvg‡b GKUv nvjKv †e¸wb i‡Oi cvÄvex `~i n‡ZB Avgvi †ek bRi Kvo‡Q|GLb †g‡qUvi mvg‡b wM‡q cvÄvexUv nv‡Z wb‡q †`L‡ev bvwK hv‡ev bv G wb‡q fvebvq cojvg|Avwg Avevi †g‡q‡`i e¨vcv‡i eiveiB †ek jvRyK|Avevi,‡dmey‡Ki Kj¨v‡Y †R‡bwQ †h C‡` kwcsg‡j †Kvb †g‡q WvK‡j hv‡eb bv|Giv Avcbv‡K w`‡q I‡`i eq‡dª‡Ûi cvÄvexi gvc wb‡e|GLb GKUy A‡c¶v K‡i mvg‡b wM‡q †`wL bvwK `~i n‡ZB †Pv‡Li †`Lvq †`wL G wb‡q wØavq cojvg|GKUy c‡iB g‡b †Rvi wb‡q mvg‡b wM‡q cvÄvexUv nv‡Z wbjvg|\n" +
                "Avwg mvg‡b hvIqv gvÎB †g‡qUv wP‡ji g‡Zv †Qvu †g‡i \"fvBqvqvqv\"e‡j cvÄvexUv‡Z nvZ w`j|fvBqv WvK ïbv gvÎB Avgvi ey‡K kxZj †mªvZ e‡q †Mj|Avgvi †evb wiqv †Zv Mªv‡g|Zv ev‡`I Avgvi PvPv‡Zv,dydv‡Zv,gvgv‡Zv me †evb‡`iB †Zv fv‡jv K‡i wPwb|GLv‡b Zvn‡j Avi †Kvb †evb G‡jv!bvwK GUv Avgvi AveŸvi wØZxq eD‡qi †g‡q ZvB G‡Zv wgw÷ K‡i Aby‡hv‡Mi my‡i WvK‡Q!AveŸvi hw` Avi GKUv eD,G‡Zv eo ev”Pv _v‡K Zvn‡j Avgiv G‡Zvw`b Rvbjvg bv!Ddd,Avi fve‡Z cviwQ bv|\n" +
                "Ggb mgq †g‡qUv Avgvi fvebvq †Q` NwU‡q ej‡jv -\"Avm‡j fvBqv n‡q‡Q wK Avwg GB cvÄvexUv ILvb n‡ZB †`L‡ZwQ|GwM‡q G‡m nv‡Z wbe Ggb mgq Avgv‡K †µvm K‡i Avcwb nv‡Z wb‡jb|wek¦vm K‡ib fvBqv GB cvÄvexUv Avgvi A‡bK A‡bK fv‡jv jvM‡Q|GUv Avwg wKb‡ev fvBqv|GLv‡b †Zv AviI KZ cvÄvex Av‡Q|‡mLvb n‡Z Avcwb Avi GKUv †`‡L †bb bv,wcøR|\"\n" +
                "K_v ï‡b Avwg †Zv _ e‡b †Mjvg!GB Zvn‡j G‡Zv gayi my‡i fvBqv WvKvi av›`vevwR|wK Avi Kivi G‡Zv Aby‡hv‡Mi my‡i Avgvi Kw_Z †evb hLb ej‡Q ZvB nvZ n‡Z cvÄvexUv †Q‡o w`jvg|\n" +
                "Gevi †g‡qUv †ek D”Q¡v‡mi mv‡_ ejj-\"G‡Zv¸jv _¨vw¼D fvBqv|Avcwb GKUy †mvRv n‡q Avgvi w`‡K gyL K‡i `vovb|\"\n" +
                "Avwg wK ej‡ev †f‡e bv †c‡q †evKvi gZ Ny‡i `vovjvg|\n" +
                "‡g‡qUv cvÄvexUv Avgvi mvg‡b Kva eivei DuwP‡q a‡i ejj-\"GK`g wdU|\n" +
                "ivqnv‡bi mv‡_ Avcbvi nvBU,¯^v¯’¨ meUviB †ek wgj Av‡Q|hvK evev!cvÄvex wKb‡Z Avi A‡Zv avw° mn¨ Ki‡Z nj bv|\"\n" +
                "Avwg g‡b g‡b,\"GB Zvn‡j †gBb K_v|\"\n" +
                "AvKw¯§K K‡ó,`yt‡L,‡¶v‡f evsjv wm‡bgvi evàviv‡Ri g‡Zv †PvL †d‡U cvwb Avm‡Z PvB‡jv|Ab¨ †KD WvK‡j ïb‡eb bv †R‡bI AvR AvwgB wK bv †du‡m †Mjvg|\n" +
                "ILvb n‡Z GwM‡q G‡m †g‡qUv †mjg¨vb‡K UvKvUv cwi‡kva K‡i Avgv‡K ejj-\"Avwg Avcbvi gv‡c ivqnv‡bi cvÄvex wKbwQ ïb‡j I Lye K‡i Avcbv‡K †`L‡Z PvB‡e|\n" +
                "fvBqv,Av‡mb bv GKUv †mwî Zywj|\"\n" +
                "wK GK gvBbKv wPcvq c‡o †Mjvg|wKš‘,‡g‡qUvi Ave`vi D‡c¶v Ki‡Z bv cvivq AMZ¨ nvwmLywk †cvR w`jvg|\n" +
                "Gici †g‡qUv nvZ †b‡o UvUv w`‡q kwcsgj †_‡K †ewi‡q †Mj|Avi,Avwg m`¨ Q¨vuKv LvIqv †cªwg‡Ki g‡Zv w¯’i `„wó‡Z ZvwK‡q iBjvg|‡g‡qUv †Pv‡Li evB‡i †h‡ZB Gevi g‡b nj,Avgvi kwcs Kivi †gRvR weM‡o †M‡Q|AvR Avi kwcs Kiv m¤¢e bv|Ae‡k‡l GK eyK nZvkv wb‡q kwcsgj n‡Z †ewi‡q evmvq Avmjvg|\n" +
                "\n" +
                "Gi wVK 2w`b c‡i wUDkwb †kl K‡i dyUcvZ w`‡q †n‡U AvmwQ|Ggb mgq wcQ‡b GKUv wi·v _vg‡jv|wcQb wd‡i †mw`‡bi †mB †g‡qUv‡K †`‡L cª_‡g g‡b nj Avevi wK †hb bZyb avÜvevwR Ki‡Z Avm‡Q|‡fvu K‡i GKUv †`Šo w`‡Z PvBjvg|\n" +
                "wKš‘,Gi Av‡MB †`wL †g‡qUv nv‡Z wKQy kwcs e¨vM wb‡q wi·v n‡Z †bg‡Q|Zv †`‡L wb‡e©va evj‡Ki g‡Zv PycPvc K‡i `uvwo‡q †Mjvg|\n" +
                "\n" +
                "‡g‡qUv †ek Kuv‡`v Kuv‡`v Mjvq e‡j DV‡jv -\"mwi fvBqv|‡mw`b Avcbvi cQ‡›`i cvÄvexUv Avcbvi KvQ n‡Z cªvq †Rvi Rei`w¯Í K‡i ivqnvb‡K †`e e‡j wb‡qwQjvg|wKš‘,I wK Ki‡jv Rv‡bb?AvR‡K I‡K mvicªvBR †`e e‡j cv‡K© wM‡q †dvb w`‡q Avm‡Z ej‡ev e‡j evwo †_‡K n‡qwQ|wKš‘,wM‡q †`‡L I Avi GKUv †g‡qi nvZ nvZ a‡i GK RvqMvq e‡m Av‡Q|Avwg wbwðZ IUv Ii bZyb †cªwgKv|wQt!Ggb wPU GKUv †Q‡j‡K Avwg GZw`b fv‡jv †e‡mwQjvg|\"\n" +
                "GB e‡j †g‡qUv dywc‡q Kvbœv ïiæ Ki‡jv|Avgvi eyS‡Z evwK _vK‡jv bv †h nv‡Z G¸‡jv ivqnvb‡K †`Iqv wMdU|wKš‘,wK e‡j ¯^všÍbv w`e †mUvI Lyu‡R cvw”Qjvg bv|\n" +
                "wgwbULv‡bK c‡i †g‡qUv †PvL gy‡Q ej‡jv-\"GB †h fvBqv,Avgvi †Zv †Kvb fvBqv bvB|ZvB,Ii Rb¨ †Kbv cvÄvex,nvZNwo,mvbMøvm,Iqv‡jU Gme Avcbv‡K †evb wn‡m‡e C` wMdU w`‡Z PvB|wcøR,Gme wb‡Z †Kvb AvcwË Ki‡eb bv|\"\n" +
                "\n" +
                "GUv ï‡b Avgvi g‡b jvÇy dyUv ïiæ Ki‡Q|Avnv!!GB †Zv Avgvi †gjvq nvwi‡q hvIqv †QvU †evb|g‡b g‡b ejjvg,\"G‡Zvw`b KB wQwj eBb?\"\n" +
                "Bk!evsjvi N‡i N‡i hw` cª‡Z¨KUv †g‡q Gfv‡e weG‡di KvQ n‡Z †avKv †L‡q Avgvi g‡Zv e¨vPji‡`i \"fvB\"‡W‡K C` wMdU Ki‡Zv Zvn‡j e¨vcviUv KZB bv gRvi n‡Zv|\n" +
                "wKQy¶Y c‡i †g‡qUv kwcse¨vM ¸‡jv nv‡Z awi‡q wi·vq D‡V P‡j †Mj|ZLb e¨vM ¸‡jv nv‡Z wb‡q Avgvi gb Avi GKevi Z„wßi †XKyi Zy‡j ej‡jv,\"Avwg cvBjvg!Avwg Avgvi Kw_Z †ev‡bi Kv‡Q C` wMdUUv cvBjvg|\"");
        ob6.setImgname(R.drawable.st06);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("‡dBK AvBwW");
        ob7.setDesc("K¬vm †U‡b DVvi gvmLv‡bK c‡i †`wL evÜex‡`i mevB †dey BDR Ki‡Q|I‡`i †ní wb‡q AvwgI GKUv AvBwW Ly‡j †djjvg|cª_g cª_g Kv‡iv mv‡_ †Zgb P¨vwUs nZ bv|wKš‘, †ek wKQyw`b n‡Z\"bxj AcivRxZv\"bv‡gi AvBwWi GK wmwbqi Avcyi mv‡_ cªvqB K_v nq|cªvq cªwZw`b Zvivex‡ni bvgv‡Ri c‡i Dwb wb‡RB Avgv‡K bK †`b| Zvi K_v ejvi g‡a¨ AwaKvskB _v‡K cªkœ,ZvI Avevi †gK-Avc,‡Wªm Avc,Ry‡qjvwi wb‡q|cªwZw`b\"‡Kvb eªv‡Ûi wjáwUK fv‡jv?wcsK Kvjvi †Wªm my›`i bvwK eøy Kvjvi?‡g‡q‡`i nvB wnj RyZvq fv‡jv jv‡M bvwK wm¤új?\"\n" +
                "hw`I Gme m¤ú‡K© Avgvi †Zgb †Kvb we‡kl aviYv †bB ZviciI wmwbq‡ii mvg‡b fve †bIqvi Rb¨ UyKUvK mv‡R÷ K‡i †`B|\n" +
                "MZKvj BdZv‡ii c‡i †gvevBj nv‡Z wb‡qB †`wL IB AvBwW n‡Z g¨v‡mR!wj‡L‡Qb,\"‡Zvgv‡K GKUv cv‡m©vbvj †Kv‡q‡ðb Kwi?\"\n" +
                "Avwg wPšÍvq c‡o †Mjvg,Dwb Avevi Kx cv‡m©vbvj †Kv‡q‡ðb Ki‡eb?\n" +
                "ejjvg,\"I‡K,K‡ib|\"\n" +
                "-\"‡Zvgvi wK weGd Av‡Q?\"\n" +
                "wØZxqev‡ii g‡Zv wPšÍvq c‡o †Mjvg|AvBwW hw`I †d‡gBj wKš‘ hw` †gBj †KD nq Avi hw` †cªvcRvj †`q|weGd Avevi †Kvb †Q‡ji mv‡_ K_v ejv cQ›` K‡i bv| wbnv‡bi mv‡_ Avgvi †h m¤úK© Pj‡Q G K_vUv GLbI †Zgb KvD‡K RvbvBwb|Z‡e,‡Mvcb †i‡L weG‡di mv‡_ Sv‡gjvi nIqvi wi¯‹ †bIqvi †P‡q mivmwi Rvbv‡bv †h‡Z cv‡i|\n" +
                "ejjvg,\n" +
                "-n¨vu,wbnvb bv‡gi GKUv †Q‡ji mv‡_ wi‡jk‡b AvwQ|\n" +
                "-KbMªvPy‡jmb †QvUAvcy|‡Zvn fvBqv Avgvi wK K‡ib?\n" +
                "-Avgvi mv`v g‡b †Kvb Kuv`v bvB| ZvB,‡ek K‡i Avgv‡`i wi‡jkb ïiæ n‡Z GLb ch©šÍ hv wQj me e‡j w`jvg|\n" +
                "-evn!‡Zvgv‡`i wi‡jkb †Zvn ÷ªs|ï‡bB wns‡m n‡”Q|Av”Qv,‡Zvgv‡`i GKUv Kvcj wcK †`Iqv hv‡e?\n" +
                "-Dbvi Ggb cªksmv ï‡b Avwg Av‡eMvcøyZ n‡q wbnv‡bi mv‡_ cª_g †WwUs‡q hvIqv †ek K‡qKUv wcKPvi cvVvjvg|\n" +
                "-IqvI!!Kx wKDU Kvcj!Av”Qv K‡e †_‡K †Zvgv‡`i wi‡jkb?\n" +
                "-GB‡Zv gvm Q‡qK n‡jv|Avgiv †ek fvjB AvwQ|Avcbvi †QvU †ev‡bi Rb¨ †`vqv Kwi‡qb|\n" +
                "GUyKy wj‡L †mÛ K‡iwQ,wVK ZLbB †K †hb gv_vi g‡a¨ PUvm K‡i GKUv PvwU gvij|wcQ‡b Ny‡i †`wL eo fvBqv `uvwo‡q Av‡Q!\n" +
                "\"III, ZyB Avgvi eÜy wbnv‡bi mv‡_ Qqgvm a‡i wi‡jk‡b AvwQm?Avevi ¯‹y‡j bv wM‡q Ii mv‡_ †WwUs K‡i †eovm|\n" +
                "`uvov,AvR‡KB hw` AveŸv‡i e‡j †Zvi V¨vs †f‡O cv‡q awi‡q †`Iqvi e¨e¯’v bv Ki‡ZwQ|\"fvBqv KUgU K‡i ejj|\n" +
                "Avwg gv_vq nvZ eyjv‡Z eyjv‡Z fvejvg,\"me©bvk! AveŸv Rvb‡j Kcv‡j kwbi mv‡_ gnvKv‡ki evwK Mªn,DcMªn¸jv mn evwK me wdª Ry‡U hv‡e|wKš‘,GB e¨vcvi †Zv Avgvi †K¬vR K‡qKUv evÜex Qvov Avi †KD Rv‡bwb|Avi,GLb IB eo AvcyUv‡K ejjvg!fvBqv Rvb‡jv Kxfv‡e?\"\n" +
                "fvBqvi w`‡K ZvKv‡ZB I ejj, \"Av‡in †eKye,bxj AcivwRZv AvgviB †dK AvBwW!\"\n" +
                "-Gevi eySjvg|fvBqvi gbUv GKUy big Kivi Rb¨ ejjvg|\"wKš‘,ZyB Bbe‡· Avgv‡K ïay Km‡gwU· Avi †Wª‡mi K_v wR‡Ám KiwZm †Kb?\"\n" +
                "-Avm‡j\"G‡Äj gvwiqv\"bv‡g AvBwWi GKUv †g‡qi mv‡_ K‡qKw`b n‡jv †cªg n‡q‡Q|fvewQ Gevi B‡` cª_g wgU Ki‡ev|I‡K wKQy †Wªm,Km‡gwU· wMdU Kivi B‡”Q Av‡Q|Avwg‡Zv †g‡q‡`i Gme Rvwb bv|ZvB,‡Zv‡K wR‡Ám K‡i K‡i †R‡b wbZvg|fvBqv †dvbUv GwM‡q w`‡q ejj,\"GB †`L AvR‡K AbjvB‡b GKUv wcsK Kvjv‡ii †WªmI AW©vi KiwQ!Kvj‡KB †Wwjfvwi †`‡e|evwK Km‡gwUKm 2/1w`‡bB g¨v‡bR K‡i wbe|\"\n" +
                "\n" +
                "-Gevi Avwg †nv‡nv K‡i †n‡m D‡V ejjvg,Av‡in fvBqv,\"G‡Äj gvwiqv\"‡Zv AveŸvi †dK AvBwW!Gevi ZyB V¨vjv mvgjv!Avi,Kvj †WªmUv Avm‡j Avgv‡K w`‡q w`m|Gevi AšÍZ B` kwcsUv Kiv jvM‡e bv|\"");
        ob7.setImgname(R.drawable.st07);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("jvj BgviZ");
        ob8.setDesc("mgqUv 2015|cošÍ we‡K‡j w`bvRcy‡i hvw”Qjvg|evm `ªæZMwZ‡Z c¨vcy †fcy evwR‡q GKUvi ci GKUv evRvi Qvwo‡q Pj‡Q|‡Kv_vI †Kv_vI hvÎx Zyj‡Z †nív‡ii †Zvi‡Rvi|KL‡bv ev ûogyo K‡i hvÎx DVvbvgvi gjøhy×|Lye ¯^vfvweKfv‡eB †`‡L hvw”Q|‡Kvb GK RvqMvq G‡m K‡qKRb †Q‡j †g‡q ZwíZívmn bvg‡jv|mvB‡Wi wej‡ev‡W© bvg †`Ljvg ev‡kinvU|Zwor MwZ‡Z g‡b ejj GUv †mB ev‡kinvU!GLv‡bB nvRx `v‡bk wek¦we`¨vjq!\n" +
                "ZZ¶‡Y evm Pj‡Z ïiæ Ki‡Q|Rvbvjv w`‡q h_vm¤¢e bRi cªk¯Í Kijvg|AwP‡iB †Pv‡L co‡jv jvj B‡Ui g¯Íeo GK wewìs|Gici †QvU †QvU AviI A‡bK|\n" +
                "AÁvZmv‡i gb ejj,\"Bk,hw` GB mxgv‡šÍ Avwg _vKZvg!‡ivR IB wewìs †_‡K iv¯Ívi QyUšÍ evm¸‡jv‡Z ¯^cœ Qyu‡q w`Zvg!g¯Í †Lvjv e¨vjKwb‡Z eÜy‡`i mv‡_Kvi AvÇv Avgvi n‡Zv |\"\n" +
                "Gici eûw`b †K‡U †M‡Q|‡Pv‡Li †Kvbvq †mB jvj BU¸‡jv ¯^‡cœi g‡Zv Av‡iKUv BgviZ K‡i‡Q|GBPGmwm G·vg w`jvg|fwZ© cix¶vi eB¸‡jv n‡jv Avgvi jvj i‡O mv`v Py‡bi g‡Zv ¯^cœMuv_vi Avjcbv|wKš‘,euva mva‡jv cwievi|‡iRvë †Zv n‡jv Gevi we‡q|\n" +
                " Avgvi DošÍ ¯^vwcœK Wvbvq wkK‡ji Uvb co‡jv!fvwm©wU‡Z cov‡kvbv Ki‡evB GB wb‡q gvmLv‡b‡Ki Abkb Kijvg|AMZ¨v kZ© Ryov‡bv n‡jv ïay nvRx `v‡b‡kB cix¶v w`‡Z n‡e|\n" +
                " ZLb Avgvi ¯^‡cœi Kv‡Q kªg bMb¨ wQj|Avgvi ¯^cœ Avgv‡K wbivk K‡iwb|\n" +
                "Gici bZyb c_Pjv|GLb jvj Bgvi‡Zi g‡Zv †ec‡ivqv ¯^cœiv Avgvi Avwac‡Z¨|GLb Avwg Avgvi ¯^‡cœi mgªvÁx|");
        ob8.setImgname(R.drawable.st08);
        holder.add(ob8);


        Model ob9=new Model();
        ob9.setHeader("i³‡hv×v‡`i Mí");
        ob9.setDesc("AvPgKv me©v‡½ Kuvcywb w`‡”Q| kxZ mKv‡ji VvÛvq Mv Kuvc‡Q bvwK †dvb fvB‡eªU Ki‡Q Ny‡gi †Nv‡i Zv Abygvb Ki‡Z cviwQjvg bv| †Kvb iK‡g nv‡Zi D‡ëv wc‡V †PvL KP‡j †`wL VvÛvq bq eis †dvbKjB D³ Abyf~wZi KviY| mKv‡j wgW G·vg _vKvq MZiv‡Z †`wi‡Z Nygv‡bv n‡q‡Q| Av‡avNy‡g wiwmf K‡i Rvbjvg 9 eQi eqmx GKUv ev”Pvi Acv‡ik‡bi Rb¨ 10 Uvi Av‡MB i‡³i `iKvi| BwZg‡a¨ wZbRb †Wvbvi wgj‡Q| wKš‘, AviI GK e¨vM jvM‡e| i‡³i K_v ï‡b Nyg Nyg fveUv †K‡U †Mj| nvmcvZv‡ji wVKvbv,‡ivMxi AvZœxq‡`i b¤^i Kx c¨v‡W Vy‡K wbjvg| \n" +
                " evwo †_‡K nvmcvZvj Gici G·v‡g G‡UÛ Ki‡Z LvIqvi mgq n‡e bv †f‡e LvIqvi e‡›`ve¯Í n‡q‡Q wK bv Zv gv‡K wR‡Ám Kijvg| Avgvi K_v ï‡b gv †evanq f¨vev‡PKv †Lj| ejj,\"ZyB †Zv GZ mKv‡j wKQy Lvm bv| AvR Avevi wK n‡jv?\"\n" +
                "KviY ejjvg| i³ w`‡Z hv‡ev ï‡b gv †Z‡j‡e¸‡b R¡‡j DV‡jv| †Nvi AvcwËi mv‡_ Rvbvj, \"K'w`b Av‡MB R¡i †_‡K DVwj| GLb Avevi cix¶v Pj‡Q Avi ZyB i³ w`‡Z hvwe| gv_v wVK Av‡Q †Zv? `vov †Zvi AveŸy‡K ejwQ| \" \n" +
                "gv‡K †Kvbg‡Z †evSv‡Z cvi‡jI AveŸy‡K cvi‡ev bv Zv Rvbv wQj| ZvB j¶¥x †g‡qwUi g‡Zv †evSv‡bvi †Póv Kijvg †h GUv dvBbvj cix¶v bq | †Kvb AmyweavB n‡e bv| G·vg †Zv 11 Uvq| Avwg wVK mg‡q †cŠu‡Q hv‡ev|\n" +
                " wKš‘, gv‡qi GK K_v| †kl ch©šÍ ej‡Z eva¨ njvg gv wKQyw`b Av‡M kvqjv Avcy †Wwjfvwii mgq  wKfv‡e gviv †MwQj, Rv‡bv? Avcyi Acv‡ik‡bi Rb¨ we †b‡MwUf i‡³i `iKvi wQj| wKš‘, GB i³ Lye GKUv cvIqv hvq bv| Iw`‡K i³ g¨v‡bR Ki‡Z †`wi nIqvq Acv‡ikbI †`wi‡Z nj| Avcy‡K  euvPv‡bv †M‡jv bv| Ii m‡`¨vRvZ ev”PvUv GwZg n‡jv| GLb i³UvI KZ ¸iæZ¡c~Y© wRwbm eyS‡Z cviQ?\n" +
                "   gv Gevi wKQyUv big n‡jv| AvwgI ZwoNwo K‡i iIbv w`jvg| Ggwb‡ZB MªvgxY iv¯Ív Gi Dci kx‡Zi Kvi‡Y A‡Uv /f¨vb †c‡Z fv‡jvB mgm¨v n‡jv| G‡Ki ci GK ÷‡c‡R evm _vgv‡bvi Svw° †Zv wQjB! 10Uvi Av‡M nvmcvZvj †cŠuQv‡bv Gici ILvb †_‡K mgq g‡Zv fvwm©wU‡Z †h‡Z cvi‡ev wK bv Gme wb‡q `ywðšÍvI nw”Qj| Ae‡k‡l mdjfv‡e i³ w`‡q ev”PvUvi gv Ges AvZœxq ¯^Rb‡`i †Pv‡Lgy‡L †h K„ZÁZv †`Ljvg Zv Aeb©bxq| wKQy¶Y wekªvg wb‡q †divi c‡_ miKvix K‡jR †gv‡oB cªvq GMv‡ivUv| G‡K wKQy wiwfkb †`Iqv nqwb Dciš‘ †h‡Z †`wi nIqvq DwØMœ †eva nw”Qj| \n" +
                "A‡Uv ZZ¶‡Y kn‡ii wNwÄ †Q‡o duvKv †iv‡W Pj‡Q...... \n" +
                "Mv‡q g„`yg›` †iv‡`i QUv SvcUv jvM‡Q| DwØMœZv †K‡U wM‡q gy‡L A™¢yZ cªkvwšÍ| Avi gb ej‡Q i‡³i Rb¨ GK AvZœxq GwZg n‡jI Av‡iK AbvZœx‡qi Rxeb euvPv‡Z mvnvh¨ Kijvg GB ¯^v_©KZv,GB ¯^v_©KZv....");
        ob9.setImgname(R.drawable.st09);
        holder.add(ob9);



        Model ob10=new Model();
        ob10.setHeader("wbg cvZvi im");
        ob10.setDesc("‡QvU‡ejv †_‡KB wg›Uy Avi wc›Uy †ek Nwbô eÜy|I‡`i `yR‡bi Mjvq Mjvq fve|GKmv‡_ †e‡o DVvq `yR‡bi AvPvi e¨env‡i †Zgb †Kvb cv_©K¨ †bB|cov‡kvbvq h‡_ó †gavex n‡jI AvÇv,‡avKvevwR Avi `yišÍcbvq `yR‡bi †KD Dwbk-wek bv|gvm Q‡qK Av‡M GKw`b wc›Uy wg›Uyi KvR †_‡K Amy¯’Zvi ARynvZ †`wL‡q 700UvKv avi Pvq|wg›Uy Av‡MB RvbZ wc›Uy‡K UvKv w`‡j †m †Kvbw`bI †diZ †`‡e bv|wKš‘,wc›Uyi †RvivRywi‡Z †kl ch©šÍ UvKv w`‡Z eva¨ nq|\n" +
                "\n" +
                "GLb Iiv `yR‡bB K¬vm bvB‡b| wKQyw`b †_‡KB wg›Uy wc›Uyi KvR †_‡K avi †`Iqv UvKvUv Pvw”Qj|wKš‘,wc›Uy AvR bq Kvj,Kvj bq ciï Gfv‡e mgq w`Z|wg›Uy Lye K‡i eyS‡jv Gi meB wc›Uyi UvKv bv †`Iqvi avÜv|wKš‘,wg›UyI †Zv GZ mn‡R †Q‡o †`Iqvi †Q‡j bq|wKfv‡e wc›Uyi KvR †_‡K UvKv †ei Kiv jvM‡e A‡bK †f‡e wP‡šÍ †m GKUv eyw× †ei Ki‡jv|\n" +
                "\n" +
                "mßvnLv‡bK c‡i `~i †_‡K wc›Uy‡K Avm‡Z †`‡L ZvovZvwo K‡i I‡`i cvovi Us‡qi †`vKv‡bi mvB‡W wg›Uy GKUv e¨vbvi Uvwb‡q w`j|e¨vbv‡ii wb‡P 2Uv †Pqvi †i‡L GKUv †evZj wb‡q em‡jv|e¨vbv‡i †gvUv mvBb‡cb w`‡q †jLv\"GLv‡b gvÎ 400 UvKvi wfwR‡U me©cªKvi †iv‡Mi wPwKrmv Kiv nq|Ilya †meb gvÎB mv‡_ mv‡_ †ivM n‡Z Av‡ivM¨ jvf Ges Ily‡a KvR bv n‡j †ivMx‡K Zr¶bvr 1000UvKv †diZ †`Iqv nq\"|\n" +
                "wg›Uyi Ggb A™¢yZ KvÛ †`‡L Av‡kcv‡ki †ek wKQy gvbyl R‡ov nj|KvQvKvwQ G‡m e¨vbv‡ii †jLv c‡o wc›Uy g‡bg‡b wgwUwgwU K‡i nvm‡Z ïiæ Ki‡jv|400UvKvq 1000UvKv cvIqv hv‡e †`‡L wc›Uyi Avi †jvf mB‡jv bv|‡m ZvovZvwo K‡i GKUv Amy‡Li bvg g‡b Kij|\n" +
                "\n" +
                "wfwR‡Ui †UvKb nv‡Z wb‡q †m ejj,\"W±i mve,wKQyw`b †_‡K Avwg †Kvb Lvev‡ii ¯^v` cvw”Q bv|GgbwK C‡` †h †MvkZ †Ljvg †mUvivI ¯^v` cvBwb|Avgv‡K Ilya w`b †`wL mv‡_ mv‡_ ¯^v` cvB wK bv|\"\n" +
                "wg›Uy Av‡M †_‡K Rvb‡Zv wc›Uy wbg cvZvi im †L‡Z cv‡i bv|‡m wc›Uy‡K †PvL eÜ Ki‡Z e‡j †evZj †_‡K GK PvgP wbg cvZvi im gy‡L w`j|mv‡_ mv‡_ wc›Uy IqvK IqvK K‡i †d‡j w`‡q e‡j GUv †Kgb Ilya!G †Zv wbg cvZvi im| \n" +
                "\n" +
                "Gevi wg›Uy Dcw¯’Z mKj‡K ej‡jv, \"Avcbviv †`L‡jb †Zv,‡h wc›Uy C‡`i Miæi Kv‡jv fybviI ¯^v` †cZ bv †m Avgvi `y‡dvuUv Ily‡a ¯^v` wd‡i †c‡q‡Q|\"\n" +
                "‡mw`‡bi g‡Zv nZevK n‡q wc›Uy evwo P‡j †Mj|wg›Uy †h I‡K G‡Zv eo \n" +
                "‡evKv evbv‡e Zv Ii aviYvB wQj bv|wKš‘,‡h K‡iB †nvK wg›Uyi c‡KU †_‡K 1000UvKv †ei Ki‡Z n‡e| ZvB,‡ek †f‡ewP‡šÍ Kw`b c‡i wc›Uy AveviI wg›Uyi †`vKv‡b Avm‡jv|\n" +
                "Gevi ejj,\"Avwg A‡bK cwo wKš‘ wKQy g‡b _v‡K bv|GKUy Av‡M wK w`‡q fvZ †L‡qwQ ZvI g‡b bvB\"|\n" +
                "wg›Uy †PvL eÜ Ki‡Z e‡j AveviI †mB wbg cvZvi im wc›Uyi gy‡L †X‡j w`j|\n" +
                "wc›Uy Gevi jvd w`‡q D‡V ejj,\"G");
        ob10.setImgname(R.drawable.st10);
        holder.add(ob10);



        Model ob11=new Model();
        ob11.setHeader("gvZ„Z¡");
        ob11.setDesc(" gv_vUvi IRb µ‡gB evo‡Q|‡Pv‡Li cvZvq exfrm gvZvj AÜKvi wQU‡K wQU‡K co‡Q|nq‡Zv So Avm‡e|‡Q‡j‡g‡q¸‡jv †h †K †Kv_vq †Mj!GB fi`ycy‡i Ggb AÜKv‡ii KviY AbymÜv‡bi AvcªvY †Póv KiwQ|KL‡bv ev”Pv‡`i ¶yavZ© gyL,KL‡bv ivbœvN‡ii fv½v cªvPxi,KL‡bv gvbe Qvqv,KL‡bv wew¶ß †ND‡ND kã †Pv‡Li g‡a¨ KyÛjx cvKv‡”Q|H †Zv ivLv‡ji ivbœvNi -\n" +
                "Gici-\n" +
                "Gici--\n" +
                "¯§…wZåg,gMR Amvo|wKQy g‡b co‡Q bv|\n" +
                " kix‡ii `ywjwb‡Z Lye Nyg cv‡”Q Avgvi|A_P †c‡U `c`c Ki‡Q ¶yav|GKPvjv D‡Vvb,‡avqv Dov‡bv Mig fvZ,ïKbv gy‡Li K‡qKwU wkï KL‡bv ¯úó KL‡bv A¯úóZvq `yj‡Q|Aa©‡evRv †Pv‡L eySjvg mvZw`b Abvnv‡i AvwQ|ev”Pv¸‡jv `ya cv‡”Q bv|¶yavi R¡vjvq nv‡Z cv‡q ai‡Q|GK`g †QvUUvi Ae¯’v Kvwnj|Avi †evanq euvPv‡Z cvijvg bv|K‡ivbv fvBiv‡mi jKWvD‡b me eÜ|‡nv‡U‡ji wcQb,gyiMxi †`vKvb †_‡K c‡_ Nv‡U meLv‡b Lyu‡RwQ|ev”Pv‡`i gy‡L `y'‡dvUv `y‡ai †hvMvb w`‡Z wb‡Ri ¶yav fy‡j gvB‡ji ci gvBj nvUwQ|‡Kv_vI `vbvUyKy cvBwb|\n" +
                "  AvR‡K emZ evwo‡Z Xy‡KwQjvg|ZLb ivLv‡ji eD gvÎ fvZ bvwg‡q K‡jicvo wM‡q‡Q|cvwZ‡j Mig fvZ †`‡L ev”Pv‡`i KiæY gyL¸‡jv fvejvg|GwM‡q fv‡Z gyL w`‡qwQ wK bv|Lywj eivei P¨vjv Kv‡Vi K‡qKUv `gv`g kã|Avi gv_vUv Nywi‡q †`L‡Z cvwiwb|‡`Šov‡bvi kw³UyKyI †cjvg bv|\n" +
                " gv_v Zy‡j k¦vm wb‡Z B‡”Q Ki‡Q GLb|‡evanq cªK„wZi evZvm dywi‡q Avm‡Q|Kv‡b ivLv‡ji eD‡qi K_v¸‡jv fvm‡Q,\"K‡ivbvq KvgvB bvB|`yBUv w`b _vwK QvIqv‡ji gyLZ fvZ w`evi cv‡iv bvB|c¨v‡Ui †fv‡K QvIqvj¸jv Kv‡›`‡Q|PvDj KiR Kwi fvZ ivwÜ Lvwj K‡jicvo †MQy|givi KyKyi kvjv Avwm fvZ¸jvZ gyL †`Bj|iv‡Mi gv_vZ w`Qy gvBi|gi!GLb GB‡V gi!\"\n" +
                "  AZtci wb¯ÍäZv|wbwg‡lB  GK gvZ„‡Z¡i Kv‡Q †n‡i hvq Av‡iK gvZ„‡Z¡i myav|");
        ob11.setImgname(R.drawable.st11);
        holder.add(ob11);


        Model ob12=new Model();
        ob12.setHeader("Mí-01");
        ob12.setDesc("‡fvi n‡q‡Q A‡bK¶Y|GL‡bv AvKvk Awfgvbx ea~i g‡Zv QvBiOv Mvj dywj‡q ¸‡gvU n‡q Av‡Q|Ggb e„wó‡fRv mKv‡ji †fRv evZvm D‡c¶v K‡i mvg‡bi iv¯Ív w`‡q  f¨vbMvwo‡Z Kviv Rvwb nv‡U hv‡”Q|\n" +
                "Riæix cª‡qvRb Qvov Ggb Z`ªv Dc‡hvMx cwi‡ek‡K e„×v½ywj †`wL‡q nv‡U hvIqvi †Kvb cªkœB Av‡m bv|Zv‡`i wK Ggb `iKvi †h GiKg Av‡qk †Q‡o nv‡U †h‡ZB n‡e?PvB‡jB GLb wbwð‡šÍ Av‡iK `g Nywg‡q wb‡jB cvi‡Zv|\n" +
                "iv¯Ívq Pjgvb mvB‡Kj,‡gvUimvB‡Kj,wiKkvi n‡Y©i kã µgvMZ Avgvi Kv‡bi AmviZv †f` Ki‡Q wKš‘ Aa©wbgxwjZ †PvL `y‡Uv †m‡U Av‡Q isnxb †`Iqv‡ji c‡j¯Ívivq|¶vwYK ev‡` A‡bK¶Y wbtk¦vm eÜ K‡i †i‡L AvZ©bv` Kiv Gjvg©-Nwoi g‡Zv N‡ii wU‡b SgSg K‡i †e‡R DV‡jv e„wó|mPivPi e„wó-ey‡bvU Ggb mKv‡j R‡¤úk Nyg nq wKš‘ AvR‡K Avgvi Amn¨ jvM‡Q|GK¸‡q †g‡Ni Avwef©v‡e evB‡i Av‡iK `dvq mÜ¨v bvg‡Q|iv‡Z myBP Ab K‡i ivLv jvj‡P a~mi wWªgjvBUwU‡K N‡ii g‡a¨ †eXc jvM‡Q|B‡”Q Ki‡jB Zv‡K _vwg‡q †`Iqv w`‡Z cviwQ wKš‘ gb mvq w`‡”Q bv|\n" +
                "e„wó,Avwg,wWªgjvBU wgwj‡q †PvL `y‡Uv hLb ¯^‡cœi g‡Zv UjUj Ki‡Q nVvr †Kv_vq Rvwb wPbwPb K‡i DV‡jv;‡evanq wfZ‡i †Kv_vI Z„òv †c‡q‡Q|Wv‡b ev‡q weQvbv nvZ‡o gy‡Vv‡dvbUv‡K Lyu‡R wbjvg|G gyn~‡Z©  Zv‡K Qvov Ab¨ KvD‡K gv_vq Avm‡Q bv|wKš‘ kZ †Póv K‡iI MZiv‡Z †cU Lvwj Ae¯’vq Nywg‡q cov †dv‡bi RvMªZ nIqvi †Kvb j¶¥Y †cjvg bvB|cigyn~‡Z© g‡b n‡jv †mB KZw`b Av‡M Ggb fiv ev`jvi mKv‡j K`g cvZvi ey‡K †jc‡U _vKv †iv`b-iƒcmxi gy‡L iex›`ªmsMxZ ï‡bwQjvg \"‡hw`b cª_g a‡iwQj Kwj Avgvi gwjøKv e‡b\",\"mwL fvebv Kv‡i Kq\",\"fv‡jv‡e‡m mwL wbf„‡Z hZ‡b Avgvi bvgUv wj‡Lv †Zvgvi g‡biI gw›`‡i|\" \n" +
                "Mvb¸‡jv m`¨ †hŠebcªvß nv‡mv¾¡j wK‡kvixi gy‡Li g‡Zv µgvš^‡q av°v Lv‡”Q wKš‘ Avgvi †Pv‡L `xN©¯’vqx n‡”Q bv|wSg a‡i ivLv `„wó µ‡gB m‡i †Mj Rvbvjvi wMª‡j|gv_vq e„wóQUv jvM‡Q Zvi Dc‡i †jvnvi wk‡Kq cvZv‡bv Kvgomvi Rv‡j mi †e‡a Av‡Q e„wói G‡jv‡g‡jv wkwki|Wvb nv‡Z mšÍc‡Y© †Uwe‡ji †KvY †_‡K GKUv eB †U‡b wbjvg|eBUv Ly‡j Dcyo n‡q ch©‡e¶Y KiwQ wKš‘ A¶i¸‡jv †hb Avgvi †_‡K eû`~‡i D`vm e„wó‡Z wZiwei K‡i bvP‡Z bvP‡Z GwM‡q Pj‡Q|\n" +
                "mvZ mKv‡j Ggb duvwKevwR!‡hfv‡eB †nvK Zv‡`i‡K RvqMvg‡Zv wdwi‡q Avb‡Z bv cvi‡j GB g‡bvig mKvjUvB e„_v hv‡e|‡mRb¨ Zv‡`i wcQywcQy Av‡¯Íax‡i nvUwQ|GKUy mvg‡b I‡`i fx‡o †K †hb j¤^v j¤^v cv‡q GwM‡q G‡jv|GwK!Ggb `ªæZ cv‡q Xy‡K †M‡j †Zv eB‡qi A¶i¸‡jv‡K D×vi Kiv m¤¢e n‡e bv|Zv‡`i‡K mwVK k‡ãi mv‡_ RvqMvg‡Zv bv emv‡Z cvi‡j Avgvi G‡Zv mv‡ai eBUv‡K wK wekªxB bv jvM‡e!\n" +
                "Aw¯’i gb I k¼vwqZ cv Df‡qi MwZ evovjvg|‡K †m??gy‡Li Dc‡i Dc‡P cov e„wói Kbv¸‡jv `y'nv‡Z KP‡j †`wL G‡Zv †mB AvacvMj Imgvb|IB †h LvwÇ wLwR‡ii mv‡_ wgwQ‡j †h‡Z †P‡qwQj †mB Imgvb|GL‡bv Zvi Py‡j Rov‡bv bvjvi gqjv¸‡jv Py‡q Py‡q co‡Q|nvUyi wbPUv †_Zjv‡bv|c¨v‡›Ui wb‡Pi Ask Kv`v fwZ©|gv_vi Puvw` w`‡q i³ Mwo‡q co‡Q|wKš‘,Ggb fvix e„wói g‡a¨ wLwRi wLwRi e‡j †m †Kv_vq Pj‡Q?\n" +
                "Avwg h_vm¤¢e †Rv‡i ejjvg,\"Imgvb fvB GB mvZmKv‡j e„wó gv_vq cwogwi K‡i KB hvb?\"\n" +
                "f&iæ‡Rvov KyuP‡K ejj,\"Avcbviv †`‡ki gvby‡li Lei †Zv iv‡Lb bv| ZvovZvwo DËicvov hvIqv jvM‡e|\n" +
                "G‡K K‡ivbv Gi Dci e„wói Kvi‡Y cvwb e›`x KZ Ni gvbyl bv †L‡q Av‡Q Zvi †LvRLei †`wL wKQyB iv‡Lb bv|wLwRi gnvR‡bi M¨v‡iR †_‡K wiKkv evBi Ki‡Q Avi Ry¤§b‡i †`Iqv Pywi Kiv ivLv †mB ¯Œy-WªvBfvi †ePvB w`‡q †mB UvKvi Lvevi wKb‡Q|G¸jvB w`‡Z hvw”Q\"|\n" +
                "Avwg AevK n‡q ejjvg,\"wKš‘ Avcbv‡i †Zv GKvB †`LwQ|wLwRi KB?\"\n" +
                "Imgvb mvg‡b ZvwK‡q ejj,\"\n" +
                "Av‡i wgqv Zywg I‡i †`L‡Z cvi‡e bv|wLwRi‡K Ggwb GgwbB †`Lv hvq bvwK|I‡i Lvwj Avwg †`wL Avi Ry¤§‡b †`‡L|wLwRi Zywg GKUy AvMvI bv fvB\"?\n" +
                "wK Rvwb †f‡e Avgv‡K ej‡jv,\"AvcbviI †Zv KvR Kvg bvB|P‡jb GKmv‡_ wM‡q mevi †LvuRLei wb‡q Avwm?\"\n" +
                "Avwg ejjvg,\"GLb GB Ae¯’vq †h‡Z cvi‡ev bv fvB|AvRKvj †`‡Lb bv †`‡ki cwiw¯’wZ|‡Uwjwfkb,B›Uvi‡bU,‡gvevBj,\n" +
                "‡dmeyK meLv‡b miKvi evievi N‡i _vK‡Z mZK© Ki‡Q|Av‡M wb‡Ri,cwiev‡ii Rxeb euvPvB Gici bv nq Rb‡mev Ki‡ev|\"\n" +
                "\"wbKywP Kwi Avcbvi Rxe‡bi|wLwRi‡i †`‡L wKQy wk‡L †bb|‡m Rb¥cwiPqnxb,NycwP ew¯Íi †bvsiv gvbyl,‡`L‡Z KOvj n‡Z cv‡i wKš‘ Zvi Kv‡Q Avcbvi g‡Zv f`ª‡jv‡Ki nvIqv bvB gkvB|‡mB 69 †_‡K AvR ch©šÍ wLwRi Avjx N‡i e‡m _vK‡Z cvi‡jv bv|\"‡kl jvBbUv ej‡Z ej‡Z e„wói eyK wP‡o D`g MwZ‡Z GwM‡q †Mj Imgvb|`yB w`‡Ki evwoNi¸‡jv m‡i wM‡q †hb I‡K Av‡jvi c_ †`wL‡q w`‡”Q|\n" +
                "`~‡i †Kv_vI evR covi k‡ã †Nvi Kv‡U Avgvi|‡Lvjv eBUv G‡Zv¶Y †hb Avgvi w`‡K ZvwK‡q frmb©v Ki‡Q|e„wó †_‡g †M‡Q|wKš‘,AvKvk †g‡N _g_‡g|gš’i †gN¸‡jvi eyK wP‡o we`¨yr DuwK w`‡q wejxb n‡”Q|Rvbvjvi Icv‡k iv¯Ívi eo eo Mv‡Qi cvZvq Rgv‡bv cvwb¸‡jv AweKj AZ„ß AvZœvi g‡Zv Syj‡Q|‡hgb fv‡e wLwRi‡K Qyu‡Z Imgvb Qv‡`i Kvwb©‡k Sy‡j|\n" +
                "ivbœvNi †_‡K gv‡qi Zje G‡jv|wLPywo Avi gvQfvRvq fvix evZvm bv‡K †jvf Qwo‡q hv‡”Q|gv_vUv fvix n‡q‡Q|GZ¶Y wK bv wK Ávb w`‡q †Mj †Kv_vKvi GK AvacvMj Imgvb|Wv‡b ev‡q eviK‡qK gv_v `ywj‡q ivbœvN‡i hvIqvi cv evovjvg|‡gjvgvB‡bi KviæKvR Kiv †cø‡U †avuqv IVv wLPywo Avi gPg‡P gvQfvRv †L‡Z †L‡Z gb ej‡Q,\" GB †h Avgvi wbivc` MnŸ‡i gv_v ¸‡R Ggb Mig Mig Lvw”Q,Nygvw”Q,we‡bvw`Z nw”Q ev Aem‡i eB c‡o Ávbx nw”Q,wK‡m gvby‡li fv‡jv,wK‡m g›` nq †m K_v fvewQ GUvB ev Rb‡mevi †P‡q †Kvb As‡k Kg?\"");
        ob12.setImgname(R.drawable.st12);
        holder.add(ob12);


//        Model ob11=new Model();
//        ob11.setHeader("Node JS Programming");
//        ob11.setDesc("Web based Programming");
//        ob11.setImgname(R.drawable.nodejs);
//        holder.add(ob11);


        return holder;
    }
}
