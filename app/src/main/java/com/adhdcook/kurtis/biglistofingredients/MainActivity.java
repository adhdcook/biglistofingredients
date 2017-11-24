package com.adhdcook.kurtis.biglistofingredients;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    AdView mAdview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,"ca-app-pub-5322871250401833/5265802261");

        mAdview =(AdView)findViewById(R.id.adView);
        AdRequest adRequest= new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        expandableListView = (ExpandableListView)findViewById(R.id.exp_listview);
        List<String> Headings = new ArrayList<String>();
        List<String> L2 = new ArrayList<String>();
        List<String> L1 = new ArrayList<String>();
        List<String> L3 = new ArrayList<String>();
        List<String> L4 = new ArrayList<String>();
        List<String> L5 = new ArrayList<String>();
        List<String> L6 = new ArrayList<String>();
        List<String> L7 = new ArrayList<String>();
        List<String> L8 = new ArrayList<String>();
        List<String> L9 = new ArrayList<String>();
        List<String> L10 = new ArrayList<String>();
        List<String> L11 = new ArrayList<String>();
        List<String> L12 = new ArrayList<String>();
        List<String> L13 = new ArrayList<String>();
        List<String> L14 = new ArrayList<String>();
        List<String> L15 = new ArrayList<String>();
        List<String> L16 = new ArrayList<String>();
        List<String> L17 = new ArrayList<String>();
        List<String> L18 = new ArrayList<String>();
        List<String> L19 = new ArrayList<String>();
        List<String> L20 = new ArrayList<String>();
        List<String> L21 = new ArrayList<String>();
        List<String> L22 = new ArrayList<String>();
        List<String> L23 = new ArrayList<String>();
        List<String> L24 = new ArrayList<String>();
        List<String> L25 = new ArrayList<String>();
        List<String> L26 = new ArrayList<String>();
        List<String> L27 = new ArrayList<String>();
        List<String> L28 = new ArrayList<String>();
        List<String> L29 = new ArrayList<String>();
        List<String> L30 = new ArrayList<String>();
        List<String> L31 = new ArrayList<String>();
        List<String> L32 = new ArrayList<String>();
        List<String> L33 = new ArrayList<String>();
        List<String> L34 = new ArrayList<String>();
        List<String> L35 = new ArrayList<String>();
        List<String> L36 = new ArrayList<String>();
        List<String> L37 = new ArrayList<String>();
        List<String> L38 = new ArrayList<String>();
        List<String> L39 = new ArrayList<String>();
        List<String> L40 = new ArrayList<String>();
        List<String> L41 = new ArrayList<String>();
        List<String> L42 = new ArrayList<String>();
        List<String> L43 = new ArrayList<String>();
        List<String> L44 = new ArrayList<String>();
        List<String> L45 = new ArrayList<String>();
        List<String> L46 = new ArrayList<String>();
        List<String> L47 = new ArrayList<String>();
        List<String> L48 = new ArrayList<String>();
        List<String> L49 = new ArrayList<String>();
        List<String> L50 = new ArrayList<String>();
        List<String> L51 = new ArrayList<String>();
        List<String> L52 = new ArrayList<String>();
        List<String> L53 = new ArrayList<String>();
        List<String> L54 = new ArrayList<String>();
        List<String> L55 = new ArrayList<String>();
        List<String> L56 = new ArrayList<String>();
        List<String> L57 = new ArrayList<String>();
        List<String> L58 = new ArrayList<String>();
        List<String> L59 = new ArrayList<String>();
        List<String> L60 = new ArrayList<String>();
        List<String> L61 = new ArrayList<String>();
        List<String> L62 = new ArrayList<String>();
        List<String> L63 = new ArrayList<String>();
        List<String> L64 = new ArrayList<String>();
        List<String> L65 = new ArrayList<String>();
        List<String> L66 = new ArrayList<String>();
        List<String> L67 = new ArrayList<String>();
        List<String> L68 = new ArrayList<String>();
        List<String> L69 = new ArrayList<String>();
        List<String> L70 = new ArrayList<String>();
        List<String> L71 = new ArrayList<String>();
        List<String> L72 = new ArrayList<String>();
        List<String> L73 = new ArrayList<String>();
        List<String> L74 = new ArrayList<String>();
        List<String> L75 = new ArrayList<String>();
        List<String> L76 = new ArrayList<String>();
        List<String> L77 = new ArrayList<String>();
        List<String> L78 = new ArrayList<String>();
        List<String> L79 = new ArrayList<String>();
        List<String> L80 = new ArrayList<String>();
        List<String> L81 = new ArrayList<String>();
        List<String> L82 = new ArrayList<String>();
        List<String> L83 = new ArrayList<String>();
        List<String> L84 = new ArrayList<String>();
        List<String> L85 = new ArrayList<String>();
        List<String> L86 = new ArrayList<String>();
        List<String> L87 = new ArrayList<String>();
        List<String> L88 = new ArrayList<String>();
        List<String> L89 = new ArrayList<String>();
        List<String> L90 = new ArrayList<String>();
        List<String> L91 = new ArrayList<String>();
        List<String> L92 = new ArrayList<String>();
        List<String> L93 = new ArrayList<String>();
        List<String> L94 = new ArrayList<String>();
        List<String> L95 = new ArrayList<String>();
        List<String> L96 = new ArrayList<String>();
        List<String> L97 = new ArrayList<String>();
        List<String> L98 = new ArrayList<String>();
        List<String> L99 = new ArrayList<String>();
        List<String> L100 = new ArrayList<String>();
        List<String> L101 = new ArrayList<String>();
        List<String> L102 = new ArrayList<String>();
        List<String> L103 = new ArrayList<String>();
        List<String> L104 = new ArrayList<String>();
        List<String> L105 = new ArrayList<String>();
        List<String> L106 = new ArrayList<String>();
        List<String> L107 = new ArrayList<String>();
        List<String> L108 = new ArrayList<String>();
        List<String> L109 = new ArrayList<String>();
        List<String> L110 = new ArrayList<String>();
        List<String> L111 = new ArrayList<String>();
        List<String> L112 = new ArrayList<String>();
        List<String> L113 = new ArrayList<String>();
        List<String> L114 = new ArrayList<String>();
        List<String> L115 = new ArrayList<String>();
        List<String> L116 = new ArrayList<String>();
        List<String> L117 = new ArrayList<String>();
        List<String> L118 = new ArrayList<String>();
        List<String> L119 = new ArrayList<String>();
        List<String> L120 = new ArrayList<String>();
        List<String> L121 = new ArrayList<String>();
        List<String> L122 = new ArrayList<String>();
        List<String> L123 = new ArrayList<String>();
        List<String> L124 = new ArrayList<String>();
        List<String> L125 = new ArrayList<String>();
        List<String> L126 = new ArrayList<String>();
        List<String> L127 = new ArrayList<String>();
        List<String> L128 = new ArrayList<String>();
        List<String> L129 = new ArrayList<String>();
        List<String> L130 = new ArrayList<String>();
        List<String> L131 = new ArrayList<String>();
        List<String> L132 = new ArrayList<String>();
        List<String> L133 = new ArrayList<String>();
        List<String> L134 = new ArrayList<String>();
        List<String> L135 = new ArrayList<String>();
        List<String> L136 = new ArrayList<String>();
        List<String> L137 = new ArrayList<String>();
        List<String> L138 = new ArrayList<String>();
        List<String> L139 = new ArrayList<String>();
        List<String> L140 = new ArrayList<String>();
        List<String> L141 = new ArrayList<String>();
        List<String> L142 = new ArrayList<String>();
        List<String> L143 = new ArrayList<String>();
        List<String> L144 = new ArrayList<String>();
        List<String> L145 = new ArrayList<String>();
        List<String> L146 = new ArrayList<String>();
        List<String> L147 = new ArrayList<String>();
        List<String> L148 = new ArrayList<String>();
        List<String> L149 = new ArrayList<String>();
        List<String> L150 = new ArrayList<String>();
        List<String> L151 = new ArrayList<String>();
        List<String> L152 = new ArrayList<String>();
        List<String> L153 = new ArrayList<String>();
        List<String> L154 = new ArrayList<String>();
        List<String> L155 = new ArrayList<String>();
        List<String> L156 = new ArrayList<String>();
        List<String> L157 = new ArrayList<String>();
        List<String> L158 = new ArrayList<String>();
        List<String> L159 = new ArrayList<String>();
        List<String> L160 = new ArrayList<String>();
        List<String> L161 = new ArrayList<String>();
        List<String> L162 = new ArrayList<String>();
        List<String> L163 = new ArrayList<String>();
        List<String> L164 = new ArrayList<String>();
        List<String> L165 = new ArrayList<String>();
        List<String> L166 = new ArrayList<String>();
        List<String> L167 = new ArrayList<String>();
        List<String> L168 = new ArrayList<String>();
        List<String> L169 = new ArrayList<String>();
        List<String> L170 = new ArrayList<String>();
        List<String> L171 = new ArrayList<String>();
        List<String> L172 = new ArrayList<String>();
        List<String> L173 = new ArrayList<String>();
        List<String> L174 = new ArrayList<String>();
        List<String> L175 = new ArrayList<String>();
        List<String> L176 = new ArrayList<String>();
        List<String> L177 = new ArrayList<String>();
        List<String> L178 = new ArrayList<String>();
        List<String> L179 = new ArrayList<String>();
        List<String> L180 = new ArrayList<String>();
        List<String> L181 = new ArrayList<String>();
        List<String> L182 = new ArrayList<String>();
        List<String> L183 = new ArrayList<String>();
        List<String> L184 = new ArrayList<String>();
        List<String> L185 = new ArrayList<String>();
        List<String> L186 = new ArrayList<String>();
        List<String> L187 = new ArrayList<String>();
        List<String> L188 = new ArrayList<String>();
        List<String> L189 = new ArrayList<String>();
        List<String> L190 = new ArrayList<String>();
        List<String> L191 = new ArrayList<String>();
        List<String> L192 = new ArrayList<String>();
        List<String> L193 = new ArrayList<String>();
        List<String> L194 = new ArrayList<String>();
        List<String> L195 = new ArrayList<String>();
        List<String> L196 = new ArrayList<String>();
        List<String> L197 = new ArrayList<String>();
        List<String> L198 = new ArrayList<String>();
        List<String> L199 = new ArrayList<String>();
        List<String> L200 = new ArrayList<String>();
        List<String> L201 = new ArrayList<String>();
        List<String> L202 = new ArrayList<String>();
        List<String> L203 = new ArrayList<String>();
        List<String> L204 = new ArrayList<String>();
        List<String> L205 = new ArrayList<String>();
        List<String> L206 = new ArrayList<String>();
        List<String> L207 = new ArrayList<String>();
        List<String> L208 = new ArrayList<String>();
        List<String> L209 = new ArrayList<String>();
        List<String> L210 = new ArrayList<String>();
        List<String> L211 = new ArrayList<String>();
        List<String> L212 = new ArrayList<String>();
        List<String> L213 = new ArrayList<String>();
        List<String> L214 = new ArrayList<String>();
        List<String> L215 = new ArrayList<String>();
        List<String> L216 = new ArrayList<String>();
        List<String> L217 = new ArrayList<String>();
        List<String> L218 = new ArrayList<String>();
        List<String> L219 = new ArrayList<String>();
        List<String> L220 = new ArrayList<String>();
        List<String> L221 = new ArrayList<String>();
        List<String> L222 = new ArrayList<String>();
        List<String> L223 = new ArrayList<String>();
        List<String> L224 = new ArrayList<String>();
        List<String> L225 = new ArrayList<String>();
        List<String> L226 = new ArrayList<String>();
        List<String> L227 = new ArrayList<String>();
        List<String> L228 = new ArrayList<String>();
        List<String> L229 = new ArrayList<String>();
        List<String> L230 = new ArrayList<String>();
        List<String> L231 = new ArrayList<String>();
        List<String> L232 = new ArrayList<String>();
        List<String> L233 = new ArrayList<String>();
        List<String> L234 = new ArrayList<String>();
        List<String> L235 = new ArrayList<String>();
        List<String> L236 = new ArrayList<String>();
        List<String> L237 = new ArrayList<String>();
        List<String> L238 = new ArrayList<String>();
        List<String> L239 = new ArrayList<String>();
        List<String> L240 = new ArrayList<String>();
        List<String> L241 = new ArrayList<String>();
        List<String> L242 = new ArrayList<String>();
        List<String> L243 = new ArrayList<String>();
        List<String> L244 = new ArrayList<String>();
        HashMap<String,List<String>> ChildList = new HashMap<String, List<String>>();

        String heading_items[] = getResources().getStringArray(R.array.header_titles);
        String l1 [] = getResources().getStringArray(R.array.h1_items);
        String l2 [] = getResources().getStringArray(R.array.h2_items);
        String l3 [] = getResources().getStringArray(R.array.h3_items);
        String l4 [] = getResources().getStringArray(R.array.h4_items);
        String l5[] = getResources().getStringArray(R.array.h5_items);
        String l6[] = getResources().getStringArray(R.array.h6_items);
        String l7[] = getResources().getStringArray(R.array.h7_items);
        String l8[] = getResources().getStringArray(R.array.h8_items);
        String l9[] = getResources().getStringArray(R.array.h9_items);
        String l10[] = getResources().getStringArray(R.array.h10_items);
        String l11[] = getResources().getStringArray(R.array.h11_items);
        String l12[] = getResources().getStringArray(R.array.h12_items);
        String l13[] = getResources().getStringArray(R.array.h13_items);
        String l14[] = getResources().getStringArray(R.array.h14_items);
        String l15[] = getResources().getStringArray(R.array.h15_items);
        String l16[] = getResources().getStringArray(R.array.h16_items);
        String l17[] = getResources().getStringArray(R.array.h17_items);
        String l18[] = getResources().getStringArray(R.array.h18_items);
        String l19[] = getResources().getStringArray(R.array.h19_items);
        String l20[] = getResources().getStringArray(R.array.h20_items);
        String l21[] = getResources().getStringArray(R.array.h21_items);
        String l22[] = getResources().getStringArray(R.array.h22_items);
        String l23[] = getResources().getStringArray(R.array.h23_items);
        String l24[] = getResources().getStringArray(R.array.h24_items);
        String l25[] = getResources().getStringArray(R.array.h25_items);
        String l26[] = getResources().getStringArray(R.array.h26_items);
        String l27[] = getResources().getStringArray(R.array.h27_items);
        String l28[] = getResources().getStringArray(R.array.h28_items);
        String l29[] = getResources().getStringArray(R.array.h29_items);
        String l30[] = getResources().getStringArray(R.array.h30_items);
        String l31[] = getResources().getStringArray(R.array.h31_items);
        String l32[] = getResources().getStringArray(R.array.h32_items);
        String l33[] = getResources().getStringArray(R.array.h33_items);
        String l34[] = getResources().getStringArray(R.array.h34_items);
        String l35[] = getResources().getStringArray(R.array.h35_items);
        String l36[] = getResources().getStringArray(R.array.h36_items);
        String l37[] = getResources().getStringArray(R.array.h37_items);
        String l38[] = getResources().getStringArray(R.array.h38_items);
        String l39[] = getResources().getStringArray(R.array.h39_items);
        String l40[] = getResources().getStringArray(R.array.h40_items);
        String l41[] = getResources().getStringArray(R.array.h41_items);
        String l42[] = getResources().getStringArray(R.array.h42_items);
        String l43[] = getResources().getStringArray(R.array.h43_items);
        String l44[] = getResources().getStringArray(R.array.h44_items);
        String l45[] = getResources().getStringArray(R.array.h45_items);
        String l46[] = getResources().getStringArray(R.array.h46_items);
        String l47[] = getResources().getStringArray(R.array.h47_items);
        String l48[] = getResources().getStringArray(R.array.h48_items);
        String l49[] = getResources().getStringArray(R.array.h49_items);
        String l50[] = getResources().getStringArray(R.array.h50_items);
        String l51[] = getResources().getStringArray(R.array.h51_items);
        String l52[] = getResources().getStringArray(R.array.h52_items);
        String l53[] = getResources().getStringArray(R.array.h53_items);
        String l54[] = getResources().getStringArray(R.array.h54_items);
        String l55[] = getResources().getStringArray(R.array.h55_items);
        String l56[] = getResources().getStringArray(R.array.h56_items);
        String l57[] = getResources().getStringArray(R.array.h57_items);
        String l58[] = getResources().getStringArray(R.array.h58_items);
        String l59[] = getResources().getStringArray(R.array.h59_items);
        String l60[] = getResources().getStringArray(R.array.h60_items);
        String l61[] = getResources().getStringArray(R.array.h61_items);
        String l62[] = getResources().getStringArray(R.array.h62_items);
        String l63[] = getResources().getStringArray(R.array.h63_items);
        String l64[] = getResources().getStringArray(R.array.h64_items);
        String l65[] = getResources().getStringArray(R.array.h65_items);
        String l66[] = getResources().getStringArray(R.array.h66_items);
        String l67[] = getResources().getStringArray(R.array.h67_items);
        String l68[] = getResources().getStringArray(R.array.h68_items);
        String l69[] = getResources().getStringArray(R.array.h69_items);
        String l70[] = getResources().getStringArray(R.array.h70_items);
        String l71[] = getResources().getStringArray(R.array.h71_items);
        String l72[] = getResources().getStringArray(R.array.h72_items);
        String l73[] = getResources().getStringArray(R.array.h73_items);
        String l74[] = getResources().getStringArray(R.array.h74_items);
        String l75[] = getResources().getStringArray(R.array.h75_items);
        String l76[] = getResources().getStringArray(R.array.h76_items);
        String l77[] = getResources().getStringArray(R.array.h77_items);
        String l78[] = getResources().getStringArray(R.array.h78_items);
        String l79[] = getResources().getStringArray(R.array.h79_items);
        String l80[] = getResources().getStringArray(R.array.h80_items);
        String l81[] = getResources().getStringArray(R.array.h81_items);
        String l82[] = getResources().getStringArray(R.array.h82_items);
        String l83[] = getResources().getStringArray(R.array.h83_items);
        String l84[] = getResources().getStringArray(R.array.h84_items);
        String l85[] = getResources().getStringArray(R.array.h85_items);
        String l86[] = getResources().getStringArray(R.array.h86_items);
        String l87[] = getResources().getStringArray(R.array.h87_items);
        String l88[] = getResources().getStringArray(R.array.h88_items);
        String l89[] = getResources().getStringArray(R.array.h89_items);
        String l90[] = getResources().getStringArray(R.array.h90_items);
        String l91[] = getResources().getStringArray(R.array.h91_items);
        String l92[] = getResources().getStringArray(R.array.h92_items);
        String l93[] = getResources().getStringArray(R.array.h93_items);
        String l94[] = getResources().getStringArray(R.array.h94_items);
        String l95[] = getResources().getStringArray(R.array.h95_items);
        String l96[] = getResources().getStringArray(R.array.h96_items);
        String l97[] = getResources().getStringArray(R.array.h97_items);
        String l98[] = getResources().getStringArray(R.array.h98_items);
        String l99[] = getResources().getStringArray(R.array.h99_items);
        String l100[] = getResources().getStringArray(R.array.h100_items);
        String l101[] = getResources().getStringArray(R.array.h101_items);
        String l102[] = getResources().getStringArray(R.array.h102_items);
        String l103[] = getResources().getStringArray(R.array.h103_items);
        String l104[] = getResources().getStringArray(R.array.h104_items);
        String l105[] = getResources().getStringArray(R.array.h105_items);
        String l106[] = getResources().getStringArray(R.array.h106_items);
        String l107[] = getResources().getStringArray(R.array.h107_items);
        String l108[] = getResources().getStringArray(R.array.h108_items);
        String l109[] = getResources().getStringArray(R.array.h109_items);
        String l110[] = getResources().getStringArray(R.array.h110_items);
        String l111[] = getResources().getStringArray(R.array.h111_items);
        String l112[] = getResources().getStringArray(R.array.h112_items);
        String l113[] = getResources().getStringArray(R.array.h113_items);
        String l114[] = getResources().getStringArray(R.array.h114_items);
        String l115[] = getResources().getStringArray(R.array.h115_items);
        String l116[] = getResources().getStringArray(R.array.h116_items);
        String l117[] = getResources().getStringArray(R.array.h117_items);
        String l118[] = getResources().getStringArray(R.array.h118_items);
        String l119[] = getResources().getStringArray(R.array.h119_items);
        String l120[] = getResources().getStringArray(R.array.h120_items);
        String l121[] = getResources().getStringArray(R.array.h121_items);
        String l122[] = getResources().getStringArray(R.array.h122_items);
        String l123[] = getResources().getStringArray(R.array.h123_items);
        String l124[] = getResources().getStringArray(R.array.h124_items);
        String l125[] = getResources().getStringArray(R.array.h125_items);
        String l126[] = getResources().getStringArray(R.array.h126_items);
        String l127[] = getResources().getStringArray(R.array.h127_items);
        String l128[] = getResources().getStringArray(R.array.h128_items);
        String l129[] = getResources().getStringArray(R.array.h129_items);
        String l130[] = getResources().getStringArray(R.array.h130_items);
        String l131[] = getResources().getStringArray(R.array.h131_items);
        String l132[] = getResources().getStringArray(R.array.h132_items);
        String l133[] = getResources().getStringArray(R.array.h133_items);
        String l134[] = getResources().getStringArray(R.array.h134_items);
        String l135[] = getResources().getStringArray(R.array.h135_items);
        String l136[] = getResources().getStringArray(R.array.h136_items);
        String l137[] = getResources().getStringArray(R.array.h137_items);
        String l138[] = getResources().getStringArray(R.array.h138_items);
        String l139[] = getResources().getStringArray(R.array.h139_items);
        String l140[] = getResources().getStringArray(R.array.octopus);
        String l141[] = getResources().getStringArray(R.array.h141_items);
        String l142[] = getResources().getStringArray(R.array.h142_items);
        String l143[] = getResources().getStringArray(R.array.h143_items);
        String l144[] = getResources().getStringArray(R.array.h144_items);
        String l145[] = getResources().getStringArray(R.array.h145_items);
        String l146[] = getResources().getStringArray(R.array.h146_items);
        String l147[] = getResources().getStringArray(R.array.h147_items);
        String l148[] = getResources().getStringArray(R.array.h148_items);
        String l149[] = getResources().getStringArray(R.array.h149_items);
        String l150[] = getResources().getStringArray(R.array.h150_items);
        String l151[] = getResources().getStringArray(R.array.h151_items);
        String l152[] = getResources().getStringArray(R.array.h152_items);
        String l153[] = getResources().getStringArray(R.array.h153_items);
        String l154[] = getResources().getStringArray(R.array.h154_items);
        String l155[] = getResources().getStringArray(R.array.h155_items);
        String l156[] = getResources().getStringArray(R.array.h156_items);
        String l157[] = getResources().getStringArray(R.array.h157_items);
        String l158[] = getResources().getStringArray(R.array.h158_items);
        String l159[] = getResources().getStringArray(R.array.h159_items);
        String l160[] = getResources().getStringArray(R.array.h160_items);
        String l161[] = getResources().getStringArray(R.array.h161_items);
        String l162[] = getResources().getStringArray(R.array.h162_items);
        String l163[] = getResources().getStringArray(R.array.h163_items);
        String l164[] = getResources().getStringArray(R.array.h164_items);
        String l165[] = getResources().getStringArray(R.array.h165_items);
        String l166[] = getResources().getStringArray(R.array.h166_items);
        String l167[] = getResources().getStringArray(R.array.h167_items);
        String l168[] = getResources().getStringArray(R.array.h168_items);
        String l169[] = getResources().getStringArray(R.array.h169_items);
        String l170[] = getResources().getStringArray(R.array.h170_items);
        String l171[] = getResources().getStringArray(R.array.h171_items);
        String l172[] = getResources().getStringArray(R.array.h172_items);
        String l173[] = getResources().getStringArray(R.array.h173_items);
        String l174[] = getResources().getStringArray(R.array.h174_items);
        String l175[] = getResources().getStringArray(R.array.h175_items);
        String l176[] = getResources().getStringArray(R.array.h176_items);
        String l177[] = getResources().getStringArray(R.array.h177_items);
        String l178[] = getResources().getStringArray(R.array.h178_items);
        String l179[] = getResources().getStringArray(R.array.h179_items);
        String l180[] = getResources().getStringArray(R.array.h180_items);
        String l181[] = getResources().getStringArray(R.array.h181_items);
        String l182[] = getResources().getStringArray(R.array.h182_items);
        String l183[] = getResources().getStringArray(R.array.h183_items);
        String l184[] = getResources().getStringArray(R.array.h184_items);
        String l185[] = getResources().getStringArray(R.array.h185_items);
        String l186[] = getResources().getStringArray(R.array.h186_items);
        String l187[] = getResources().getStringArray(R.array.h187_items);
        String l188[] = getResources().getStringArray(R.array.h188_items);
        String l189[] = getResources().getStringArray(R.array.h189_items);
        String l190[] = getResources().getStringArray(R.array.h190_items);
        String l191[] = getResources().getStringArray(R.array.h191_items);
        String l192[] = getResources().getStringArray(R.array.h192_items);
        String l193[] = getResources().getStringArray(R.array.h193_items);
        String l194[] = getResources().getStringArray(R.array.h194_items);
        String l195[] = getResources().getStringArray(R.array.h195_items);
        String l196[] = getResources().getStringArray(R.array.h196_items);
        String l197[] = getResources().getStringArray(R.array.h197_items);
        String l198[] = getResources().getStringArray(R.array.h198_items);
        String l199[] = getResources().getStringArray(R.array.h199_items);
        String l200[] = getResources().getStringArray(R.array.h200_items);
        String l201[] = getResources().getStringArray(R.array.h201_items);
        String l202[] = getResources().getStringArray(R.array.h202_items);
        String l203[] = getResources().getStringArray(R.array.h203_items);
        String l204[] = getResources().getStringArray(R.array.h204_items);
        String l205[] = getResources().getStringArray(R.array.h205_items);
        String l206[] = getResources().getStringArray(R.array.h206_items);
        String l207[] = getResources().getStringArray(R.array.h207_items);
        String l208[] = getResources().getStringArray(R.array.h208_items);
        String l209[] = getResources().getStringArray(R.array.h209_items);
        String l210[] = getResources().getStringArray(R.array.h210_items);
        String l211[] = getResources().getStringArray(R.array.h211_items);
        String l212[] = getResources().getStringArray(R.array.h212_items);
        String l213[] = getResources().getStringArray(R.array.h213_items);
        String l214[] = getResources().getStringArray(R.array.h214_items);
        String l215[] = getResources().getStringArray(R.array.h215_items);
        String l216[] = getResources().getStringArray(R.array.h216_items);
        String l217[] = getResources().getStringArray(R.array.h217_items);
        String l218[] = getResources().getStringArray(R.array.h218_items);
        String l219[] = getResources().getStringArray(R.array.h219_items);
        String l220[] = getResources().getStringArray(R.array.h220_items);
        String l221[] = getResources().getStringArray(R.array.h221_items);
        String l222[] = getResources().getStringArray(R.array.h222_items);
        String l223[] = getResources().getStringArray(R.array.h223_items);
        String l224[] = getResources().getStringArray(R.array.h224_items);
        String l225[] = getResources().getStringArray(R.array.h225_items);
        String l226[] = getResources().getStringArray(R.array.h226_items);
        String l227[] = getResources().getStringArray(R.array.h227_items);
        String l228[] = getResources().getStringArray(R.array.h228_items);
        String l229[] = getResources().getStringArray(R.array.h229_items);
        String l230[] = getResources().getStringArray(R.array.h230_items);
        String l231[] = getResources().getStringArray(R.array.h231_items);
        String l232[] = getResources().getStringArray(R.array.h232_items);
        String l233[] = getResources().getStringArray(R.array.h233_items);
        String l234[] = getResources().getStringArray(R.array.h234_items);
        String l235[] = getResources().getStringArray(R.array.h235_items);
        String l236[] = getResources().getStringArray(R.array.h236_items);
        String l237[] = getResources().getStringArray(R.array.h237_items);
        String l238[] = getResources().getStringArray(R.array.h238_items);
        String l239[] = getResources().getStringArray(R.array.h239_items);
        String l240[] = getResources().getStringArray(R.array.h240_items);
        String l241[] = getResources().getStringArray(R.array.h241_items);
        String l242[] = getResources().getStringArray(R.array.h242_items);
        String l243[] = getResources().getStringArray(R.array.h243_items);
        String l244[] = getResources().getStringArray(R.array.h244_items);

        for (String title : heading_items)

        {
            Headings.add(title);
        }

        for (String title :l1)
        {
            L1.add(title);
        }
        for (String title :l2)
        {
            L2.add(title);
        }
        for (String title :l3)
        {
            L3.add(title);
        }
        for (String title :l4)
        {
            L4.add(title);
        }
        for (String title :l5)
        {
            L5.add(title);
        }
        for (String title :l6)
        {
            L6.add(title);
        }
        for (String title :l7)
        {
            L7.add(title);
        }
        for (String title :l8)
        {
            L8.add(title);
        }
        for (String title :l9)
        {
            L9.add(title);
        }
        for (String title :l10)
        {
            L10.add(title);
        }
        for (String title :l11)
        {
            L11.add(title);
        }
        for (String title :l12)
        {
            L12.add(title);
        }
        for (String title :l13)
        {
            L13.add(title);
        }
        for (String title :l14)
        {
            L14.add(title);
        }
        for (String title :l15)
        {
            L15.add(title);
        }

        for (String title :l16)
        {
            L16.add(title);
        }

        for (String title :l17)
        {
            L17.add(title);
        }
        for (String title :l18)
        {
            L18.add(title);
        }
        for (String title :l19)
        {
            L19.add(title);
        }
        for (String title :l20)
        {
            L20.add(title);
        }
        for (String title :l21)
        {
            L21.add(title);
        }
        for (String title :l22)
        {
            L22.add(title);
        }
        for (String title :l23)
        {
            L23.add(title);
        }
        for (String title :l24)
        {
            L24.add(title);
        }
        for (String title :l25)
        {
            L25.add(title);
        }
        for (String title :l26)
        {
            L26.add(title);
        }
        for (String title :l27)
        {
            L27.add(title);
        }
        for (String title :l28)
        {
            L28.add(title);
        }
        for (String title :l29)
        {
            L29.add(title);
        }
        for (String title :l30)
        {
            L30.add(title);
        }
        for (String title :l31)
        {
            L31.add(title);
        }
        for (String title :l32)
        {
            L32.add(title);
        }
        for (String title :l33)
        {
            L33.add(title);
        }
        for (String title :l34)
        {
            L34.add(title);
        }
        for (String title :l35)
        {
            L35.add(title);
        }
        for (String title :l36)
        {
            L36.add(title);
        }
        for (String title :l37)
        {
            L37.add(title);
        }
        for (String title :l38)
        {
            L38.add(title);
        }
        for (String title :l39)
        {
            L39.add(title);
        }
        for (String title :l40)
        {
            L40.add(title);
        }
        for (String title :l41)
        {
            L41.add(title);
        }
        for (String title :l42)
        {
            L42.add(title);
        }
        for (String title :l43)
        {
            L43.add(title);
        }
        for (String title :l44)
        {
            L44.add(title);
        }
        for (String title :l45)
        {
            L45.add(title);
        }
        for (String title :l46)
        {
            L46.add(title);
        }
        for (String title :l47)
        {
            L47.add(title);
        }
        for (String title :l48)
        {
            L48.add(title);
        }
        for (String title :l49)
        {
            L49.add(title);
        }
        for (String title :l50)
        {
            L50.add(title);
        }
        for (String title :l51)
        {
            L51.add(title);
        }
        for (String title :l52)
        {
            L52.add(title);
        }
        for (String title :l53)
        {
            L53.add(title);
        }
        for (String title :l54)
        {
            L54.add(title);
        }
        for (String title :l55)
        {
            L55.add(title);
        }
        for (String title :l56)
        {
            L56.add(title);
        }
        for (String title :l57)
        {
            L57.add(title);
        }
        for (String title :l58)
        {
            L58.add(title);
        }
        for (String title :l59)
        {
            L59.add(title);
        }
        for (String title :l60)
        {
            L60.add(title);
        }
        for (String title :l61)
        {
            L61.add(title);
        }
        for (String title :l62)
        {
            L62.add(title);
        }
        for (String title :l63)
        {
            L63.add(title);
        }
        for (String title :l64)
        {
            L64.add(title);
        }
        for (String title :l65)
        {
            L65.add(title);
        }
        for (String title :l66)
        {
            L66.add(title);
        }
        for (String title :l67)
        {
            L67.add(title);
        }
        for (String title :l68)
        {
            L68.add(title);
        }
        for (String title :l69)
        {
            L69.add(title);
        }
        for (String title :l70)
        {
            L70.add(title);
        }
        for (String title :l71)
        {
            L71.add(title);
        }
        for (String title :l72)
        {
            L72.add(title);
        }
        for (String title :l73)
        {
            L73.add(title);
        }
        for (String title :l74)
        {
            L74.add(title);
        }
        for (String title :l75)
        {
            L75.add(title);
        }
        for (String title :l76)
        {
            L76.add(title);
        }
        for (String title :l77)
        {
            L77.add(title);
        }
        for (String title :l78)
        {
            L78.add(title);
        }
        for (String title :l79)
        {
            L79.add(title);
        }
        for (String title :l80)
        {
            L80.add(title);
        }
        for (String title :l81)
        {
            L81.add(title);
        }
        for (String title :l82)
        {
            L82.add(title);
        }
        for (String title :l83)
        {
            L83.add(title);
        }
        for (String title :l84)
        {
            L84.add(title);
        }
        for (String title :l85)
        {
            L85.add(title);
        }
        for (String title :l86)
        {
            L86.add(title);
        }
        for (String title :l87)
        {
            L87.add(title);
        }
        for (String title :l88)
        {
            L88.add(title);
        }
        for (String title :l89)
        {
            L89.add(title);
        }
        for (String title :l90)
        {
            L90.add(title);
        }
        for (String title :l91)
        {
            L91.add(title);
        }
        for (String title :l92)
        {
            L92.add(title);
        }
        for (String title :l93)
        {
            L93.add(title);
        }
        for (String title :l94)
        {
            L94.add(title);
        }
        for (String title :l95)
        {
            L95.add(title);
        }
        for (String title :l96)
        {
            L96.add(title);
        }
        for (String title :l97)
        {
            L97.add(title);
        }
        for (String title :l98)
        {
            L98.add(title);
        }
        for (String title :l99)
        {
            L99.add(title);
        }
        for (String title :l100)
        {
            L100.add(title);
        }
        for (String title :l101)
        {
            L101.add(title);
        }
        for (String title :l102)
        {
            L102.add(title);
        }
        for (String title :l103)
        {
            L103.add(title);
        }
        for (String title :l104)
        {
            L104.add(title);
        }
        for (String title :l105)
        {
            L105.add(title);
        }
        for (String title :l106)
        {
            L106.add(title);
        }
        for (String title :l107)
        {
            L107.add(title);
        }
        for (String title :l108)
        {
            L108.add(title);
        }
        for (String title :l109)
        {
            L109.add(title);
        }
        for (String title :l110)
        {
            L110.add(title);
        }
        for (String title :l111)
        {
            L111.add(title);
        }
        for (String title :l112)
        {
            L112.add(title);
        }
        for (String title :l113)
        {
            L113.add(title);
        }
        for (String title :l114)
        {
            L114.add(title);
        }
        for (String title :l115)
        {
            L115.add(title);
        }
        for (String title :l116)
        {
            L116.add(title);
        }
        for (String title :l117)
        {
            L117.add(title);
        }
        for (String title :l118)
        {
            L118.add(title);
        }
        for (String title :l119)
        {
            L119.add(title);
        }
        for (String title :l120)
        {
            L120.add(title);
        }
        for (String title :l121)
        {
            L121.add(title);
        }
        for (String title :l122)
        {
            L122.add(title);
        }
        for (String title :l123)
        {
            L123.add(title);
        }
        for (String title :l124)
        {
            L124.add(title);
        }
        for (String title :l125)
        {
            L125.add(title);
        }
        for (String title :l126)
        {
            L126.add(title);
        }
        for (String title :l127)
        {
            L127.add(title);
        }
        for (String title :l128)
        {
            L128.add(title);
        }
        for (String title :l129)
        {
            L129.add(title);
        }
        for (String title :l130)
        {
            L130.add(title);
        }
        for (String title :l131)
        {
            L131.add(title);
        }
        for (String title :l132)
        {
            L132.add(title);
        }
        for (String title :l133)
        {
            L133.add(title);
        }
        for (String title :l134)
        {
            L134.add(title);
        }
        for (String title :l135)
        {
            L135.add(title);
        }
        for (String title :l136)
        {
            L136.add(title);
        }
        for (String title :l137)
        {
            L137.add(title);
        }
        for (String title :l138)
        {
            L138.add(title);
        }
        for (String title :l139)
        {
            L139.add(title);
        }
        for (String title :l140)
        {
            L140.add(title);
        }
        for (String title :l141)
        {
            L141.add(title);
        }
        for (String title :l142)
        {
            L142.add(title);
        }
        for (String title :l143)
        {
            L143.add(title);
        }
        for (String title :l144)
        {
            L144.add(title);
        }
        for (String title :l145)
        {
            L145.add(title);
        }
        for (String title :l146)
        {
            L146.add(title);
        }
        for (String title :l147)
        {
            L147.add(title);
        }
        for (String title :l148)
        {
            L148.add(title);
        }
        for (String title :l149)
        {
            L149.add(title);
        }
        for (String title :l150)
        {
            L150.add(title);
        }
        for (String title :l151)
        {
            L151.add(title);
        }
        for (String title :l152)
        {
            L152.add(title);
        }
        for (String title :l153)
        {
            L153.add(title);
        }
        for (String title :l154)
        {
            L154.add(title);
        }
        for (String title :l155)
        {
            L155.add(title);
        }
        for (String title :l156)
        {
            L156.add(title);
        }
        for (String title :l157)
        {
            L157.add(title);
        }
        for (String title :l158)
        {
            L158.add(title);
        }
        for (String title :l159)
        {
            L159.add(title);
        }
        for (String title :l160)
        {
            L160.add(title);
        }
        for (String title :l161)
        {
            L161.add(title);
        }
        for (String title :l162)
        {
            L162.add(title);
        }
        for (String title :l163)
        {
            L163.add(title);
        }
        for (String title :l164)
        {
            L164.add(title);
        }
        for (String title :l165)
        {
            L165.add(title);
        }
        for (String title :l166)
        {
            L166.add(title);
        }
        for (String title :l167)
        {
            L167.add(title);
        }
        for (String title :l168)
        {
            L168.add(title);
        }
        for (String title :l169)
        {
            L169.add(title);
        }
        for (String title :l170)
        {
            L170.add(title);
        }
        for (String title :l171)
        {
            L171.add(title);
        }
        for (String title :l172)
        {
            L172.add(title);
        }

        for (String title :l173)
        {
            L173.add(title);
        }
        for (String title :l174)
        {
            L174.add(title);
        }
        for (String title :l175)
        {
            L175.add(title);
        }
        for (String title :l176)
        {
            L176.add(title);
        }
        for (String title :l177)
        {
            L177.add(title);
        }
        for (String title :l178)
        {
            L178.add(title);
        }
        for (String title :l179)
        {
            L179.add(title);
        }
        for (String title :l180)
        {
            L180.add(title);
        }
        for (String title :l181)
        {
            L181.add(title);
        }
        for (String title :l182)
        {
            L182.add(title);
        }
        for (String title :l183)
        {
            L183.add(title);
        }
        for (String title :l184)
        {
            L184.add(title);
        }
        for (String title :l185)
        {
            L185.add(title);
        }
        for (String title :l186)
        {
            L186.add(title);
        }
        for (String title :l187)
        {
            L187.add(title);
        }
        for (String title :l188)
        {
            L188.add(title);
        }
        for (String title :l189)
        {
            L189.add(title);
        }
        for (String title :l190)
        {
            L190.add(title);
        }
        for (String title :l191)
        {
            L191.add(title);
        }
        for (String title :l192)
        {
            L192.add(title);
        }
        for (String title :l193)
        {
            L193.add(title);
        }
        for (String title :l194)
        {
            L194.add(title);
        }
        for (String title :l195)
        {
            L195.add(title);
        }
        for (String title :l196)
        {
            L196.add(title);
        }
        for (String title :l197)
        {
            L197.add(title);
        }
        for (String title :l198)
        {
            L198.add(title);
        }
        for (String title :l199)
        {
            L199.add(title);
        }
        for (String title :l200)
        {
            L200.add(title);
        }
        for (String title :l201)
        {
            L201.add(title);
        }
        for (String title :l202)
        {
            L202.add(title);
        }
        for (String title :l203)
        {
            L203.add(title);
        }
        for (String title :l204)
        {
            L204.add(title);
        }
        for (String title :l205)
        {
            L205.add(title);
        }
        for (String title :l206)
        {
            L206.add(title);
        }
        for (String title :l207)
        {
            L207.add(title);
        }
        for (String title :l208)
        {
            L208.add(title);
        }
        for (String title :l209)
        {
            L209.add(title);
        }
        for (String title :l210)
        {
            L210.add(title);
        }
        for (String title :l211)
        {
            L211.add(title);
        }
        for (String title :l212)
        {
            L212.add(title);
        }
        for (String title :l213)
        {
            L213.add(title);
        }
        for (String title :l214)
        {
            L214.add(title);
        }
        for (String title :l215)
        {
            L215.add(title);
        }
        for (String title :l216)
        {
            L216.add(title);
        }
        for (String title :l217)
        {
            L217.add(title);
        }
        for (String title :l218)
        {
            L218.add(title);
        }
        for (String title :l219)
        {
            L219.add(title);
        }
        for (String title :l220)
        {
            L220.add(title);
        }
        for (String title :l221)
        {
            L221.add(title);
        }
        for (String title :l222)
        {
            L222.add(title);
        }
        for (String title :l223)
        {
            L223.add(title);
        }
        for (String title :l224)
        {
            L224.add(title);
        }
        for (String title :l225)
        {
            L225.add(title);
        }
        for (String title :l226)
        {
            L226.add(title);
        }
        for (String title :l227)
        {
            L227.add(title);
        }
        for (String title :l228)
        {
            L228.add(title);
        }
        for (String title :l229)
        {
            L229.add(title);
        }
        for (String title :l230)
        {
            L230.add(title);
        }
        for (String title :l231)
        {
            L231.add(title);
        }
        for (String title :l232)
        {
            L232.add(title);
        }
        for (String title :l233)
        {
            L233.add(title);
        }
        for (String title :l234)
        {
            L234.add(title);
        }
        for (String title :l235)
        {
            L235.add(title);
        }
        for (String title :l236)
        {
            L236.add(title);
        }
        for (String title :l237)
        {
            L237.add(title);
        }
        for (String title :l238)
        {
            L238.add(title);
        }
        for (String title :l239)
        {
            L239.add(title);
        }
        for (String title :l240)
        {
            L240.add(title);
        }
        for (String title :l241)
        {
            L241.add(title);
        }
        for (String title :l242)
        {
            L242.add(title);
        }
        for (String title :l243)
        {
            L243.add(title);
        }
        for (String title :l244)
        {
            L244.add(title);
        }
        ChildList.put(Headings.get(0),L1);
        ChildList.put(Headings.get(1),L2);
        ChildList.put(Headings.get(2),L3);
        ChildList.put(Headings.get(3),L4);
        ChildList.put(Headings.get(4),L5);
        ChildList.put(Headings.get(5),L6);
        ChildList.put(Headings.get(6),L7);
        ChildList.put(Headings.get(7),L8);
        ChildList.put(Headings.get(8),L9);
        ChildList.put(Headings.get(9),L10);
        ChildList.put(Headings.get(10),L11);
        ChildList.put(Headings.get(11),L12);
        ChildList.put(Headings.get(12),L13);
        ChildList.put(Headings.get(13),L14);
        ChildList.put(Headings.get(14),L15);
        ChildList.put(Headings.get(15),L16);
        ChildList.put(Headings.get(16),L17);
        ChildList.put(Headings.get(17),L18);
        ChildList.put(Headings.get(18),L19);
        ChildList.put(Headings.get(19),L20);
        ChildList.put(Headings.get(20),L21);
        ChildList.put(Headings.get(21),L22);
        ChildList.put(Headings.get(22),L23);
        ChildList.put(Headings.get(23),L24);
        ChildList.put(Headings.get(24),L25);
        ChildList.put(Headings.get(25),L26);
        ChildList.put(Headings.get(26),L27);
        ChildList.put(Headings.get(27),L28);
        ChildList.put(Headings.get(28),L29);
        ChildList.put(Headings.get(29),L30);
        ChildList.put(Headings.get(30),L31);
        ChildList.put(Headings.get(31),L32);
        ChildList.put(Headings.get(32),L33);
        ChildList.put(Headings.get(33),L34);
        ChildList.put(Headings.get(34),L35);
        ChildList.put(Headings.get(35),L36);
        ChildList.put(Headings.get(36),L37);
        ChildList.put(Headings.get(37),L38);
        ChildList.put(Headings.get(38),L39);
        ChildList.put(Headings.get(39),L40);
        ChildList.put(Headings.get(40),L41);
        ChildList.put(Headings.get(41),L42);
        ChildList.put(Headings.get(42),L43);
        ChildList.put(Headings.get(43),L44);
        ChildList.put(Headings.get(44),L45);
        ChildList.put(Headings.get(45),L46);
        ChildList.put(Headings.get(46),L47);
        ChildList.put(Headings.get(47),L48);
        ChildList.put(Headings.get(48),L49);
        ChildList.put(Headings.get(49),L50);
        ChildList.put(Headings.get(50),L51);
        ChildList.put(Headings.get(51),L52);
        ChildList.put(Headings.get(52),L53);
        ChildList.put(Headings.get(53),L54);
        ChildList.put(Headings.get(54),L55);
        ChildList.put(Headings.get(55),L56);
        ChildList.put(Headings.get(56),L57);
        ChildList.put(Headings.get(57),L58);
        ChildList.put(Headings.get(58),L59);
        ChildList.put(Headings.get(59),L60);
        ChildList.put(Headings.get(60),L61);
        ChildList.put(Headings.get(61),L62);
        ChildList.put(Headings.get(62),L63);
        ChildList.put(Headings.get(63),L64);
        ChildList.put(Headings.get(64),L65);
        ChildList.put(Headings.get(65),L66);
        ChildList.put(Headings.get(66),L67);
        ChildList.put(Headings.get(67),L68);
        ChildList.put(Headings.get(68),L69);
        ChildList.put(Headings.get(69),L70);
        ChildList.put(Headings.get(70),L71);
        ChildList.put(Headings.get(71),L72);
        ChildList.put(Headings.get(72),L73);
        ChildList.put(Headings.get(73),L74);
        ChildList.put(Headings.get(74),L75);
        ChildList.put(Headings.get(75),L76);
        ChildList.put(Headings.get(76),L77);
        ChildList.put(Headings.get(77),L78);
        ChildList.put(Headings.get(78),L79);
        ChildList.put(Headings.get(79),L80);
        ChildList.put(Headings.get(80),L81);
        ChildList.put(Headings.get(81),L82);
        ChildList.put(Headings.get(82),L83);
        ChildList.put(Headings.get(83),L84);
        ChildList.put(Headings.get(84),L85);
        ChildList.put(Headings.get(85),L86);
        ChildList.put(Headings.get(86),L87);
        ChildList.put(Headings.get(87),L88);
        ChildList.put(Headings.get(88),L89);
        ChildList.put(Headings.get(89),L90);
        ChildList.put(Headings.get(90),L91);
        ChildList.put(Headings.get(91),L92);
        ChildList.put(Headings.get(92),L93);
        ChildList.put(Headings.get(93),L94);
        ChildList.put(Headings.get(94),L95);
        ChildList.put(Headings.get(95),L96);
        ChildList.put(Headings.get(96),L97);
        ChildList.put(Headings.get(97),L98);
        ChildList.put(Headings.get(98),L99);
        ChildList.put(Headings.get(99),L100);
        ChildList.put(Headings.get(100),L101);
        ChildList.put(Headings.get(101),L102);
        ChildList.put(Headings.get(102),L103);
        ChildList.put(Headings.get(103),L104);
        ChildList.put(Headings.get(104),L105);
        ChildList.put(Headings.get(105),L106);
        ChildList.put(Headings.get(106),L107);
        ChildList.put(Headings.get(107),L108);
        ChildList.put(Headings.get(108),L109);
        ChildList.put(Headings.get(109),L110);
        ChildList.put(Headings.get(110),L111);
        ChildList.put(Headings.get(111),L112);
        ChildList.put(Headings.get(112),L113);
        ChildList.put(Headings.get(113),L114);
        ChildList.put(Headings.get(114),L115);
        ChildList.put(Headings.get(115),L116);
        ChildList.put(Headings.get(116),L117);
        ChildList.put(Headings.get(117),L118);
        ChildList.put(Headings.get(118),L119);
        ChildList.put(Headings.get(119),L120);
        ChildList.put(Headings.get(120),L121);
        ChildList.put(Headings.get(121),L122);
        ChildList.put(Headings.get(122),L123);
        ChildList.put(Headings.get(123),L124);
        ChildList.put(Headings.get(124),L125);
        ChildList.put(Headings.get(125),L126);
        ChildList.put(Headings.get(126),L127);
        ChildList.put(Headings.get(127),L128);
        ChildList.put(Headings.get(128),L129);
        ChildList.put(Headings.get(129),L130);
        ChildList.put(Headings.get(130),L131);
        ChildList.put(Headings.get(131),L132);
        ChildList.put(Headings.get(132),L133);
        ChildList.put(Headings.get(133),L134);
        ChildList.put(Headings.get(134),L135);
        ChildList.put(Headings.get(135),L136);
        ChildList.put(Headings.get(136),L137);
        ChildList.put(Headings.get(137),L138);
        ChildList.put(Headings.get(138),L139);
        ChildList.put(Headings.get(139),L140);
        ChildList.put(Headings.get(140),L141);
        ChildList.put(Headings.get(141),L142);
        ChildList.put(Headings.get(142),L143);
        ChildList.put(Headings.get(143),L144);
        ChildList.put(Headings.get(144),L145);
        ChildList.put(Headings.get(145),L146);
        ChildList.put(Headings.get(146),L147);
        ChildList.put(Headings.get(147),L148);
        ChildList.put(Headings.get(148),L149);
        ChildList.put(Headings.get(149),L150);
        ChildList.put(Headings.get(150),L151);
        ChildList.put(Headings.get(151),L152);
        ChildList.put(Headings.get(152),L153);
        ChildList.put(Headings.get(153),L154);
        ChildList.put(Headings.get(154),L155);
        ChildList.put(Headings.get(155),L156);
        ChildList.put(Headings.get(156),L157);
        ChildList.put(Headings.get(157),L158);
        ChildList.put(Headings.get(158),L159);
        ChildList.put(Headings.get(159),L160);
        ChildList.put(Headings.get(160),L161);
        ChildList.put(Headings.get(161),L162);
        ChildList.put(Headings.get(162),L163);
        ChildList.put(Headings.get(163),L164);
        ChildList.put(Headings.get(164),L165);
        ChildList.put(Headings.get(165),L166);
        ChildList.put(Headings.get(166),L167);
        ChildList.put(Headings.get(167),L168);
        ChildList.put(Headings.get(168),L169);
        ChildList.put(Headings.get(169),L170);
        ChildList.put(Headings.get(170),L171);
        ChildList.put(Headings.get(171),L172);
        ChildList.put(Headings.get(172),L173);
        ChildList.put(Headings.get(173),L174);
        ChildList.put(Headings.get(174),L175);
        ChildList.put(Headings.get(175),L176);
        ChildList.put(Headings.get(176),L177);
        ChildList.put(Headings.get(177),L178);
        ChildList.put(Headings.get(178),L179);
        ChildList.put(Headings.get(179),L180);
        ChildList.put(Headings.get(180),L181);
        ChildList.put(Headings.get(181),L182);
        ChildList.put(Headings.get(182),L183);
        ChildList.put(Headings.get(183),L184);
        ChildList.put(Headings.get(184),L185);
        ChildList.put(Headings.get(185),L186);
        ChildList.put(Headings.get(186),L187);
        ChildList.put(Headings.get(187),L188);
        ChildList.put(Headings.get(188),L189);
        ChildList.put(Headings.get(189),L190);
        ChildList.put(Headings.get(190),L191);
        ChildList.put(Headings.get(191),L192);
        ChildList.put(Headings.get(192),L193);
        ChildList.put(Headings.get(193),L194);
        ChildList.put(Headings.get(194),L195);
        ChildList.put(Headings.get(195),L196);
        ChildList.put(Headings.get(196),L197);
        ChildList.put(Headings.get(197),L198);
        ChildList.put(Headings.get(198),L199);
        ChildList.put(Headings.get(199),L200);
        ChildList.put(Headings.get(200),L201);
        ChildList.put(Headings.get(201),L202);
        ChildList.put(Headings.get(202),L203);
        ChildList.put(Headings.get(203),L204);
        ChildList.put(Headings.get(204),L205);
        ChildList.put(Headings.get(205),L206);
        ChildList.put(Headings.get(206),L207);
        ChildList.put(Headings.get(207),L208);
        ChildList.put(Headings.get(208),L209);
        ChildList.put(Headings.get(209),L210);
        ChildList.put(Headings.get(210),L211);
        ChildList.put(Headings.get(211),L212);
        ChildList.put(Headings.get(212),L213);
        ChildList.put(Headings.get(213),L214);
        ChildList.put(Headings.get(214),L215);
        ChildList.put(Headings.get(215),L216);
        ChildList.put(Headings.get(216),L217);
        ChildList.put(Headings.get(217),L218);
        ChildList.put(Headings.get(218),L219);
        ChildList.put(Headings.get(219),L220);
        ChildList.put(Headings.get(220),L221);
        ChildList.put(Headings.get(221),L222);
        ChildList.put(Headings.get(222),L223);
        ChildList.put(Headings.get(223),L224);
        ChildList.put(Headings.get(224),L225);
        ChildList.put(Headings.get(225),L226);
        ChildList.put(Headings.get(226),L227);
        ChildList.put(Headings.get(227),L228);
        ChildList.put(Headings.get(228),L229);
        ChildList.put(Headings.get(229),L230);
        ChildList.put(Headings.get(230),L231);
        ChildList.put(Headings.get(231),L232);
        ChildList.put(Headings.get(232),L233);
        ChildList.put(Headings.get(233),L234);
        ChildList.put(Headings.get(234),L235);
        ChildList.put(Headings.get(235),L236);
        ChildList.put(Headings.get(236),L237);
        ChildList.put(Headings.get(237),L238);
        ChildList.put(Headings.get(238),L239);
        ChildList.put(Headings.get(239),L240);
        ChildList.put(Headings.get(240),L241);
        ChildList.put(Headings.get(241),L242);
        ChildList.put(Headings.get(242),L243);
        ChildList.put(Headings.get(243),L244);
        MyAdapter myAdapter = new MyAdapter(this,Headings,ChildList);
        expandableListView.setAdapter(myAdapter);
    }


}