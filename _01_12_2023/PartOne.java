package _01_12_2023;

import java.util.*;

public class PartOne {

    public static void main(String[] args) {
        PartOne main = new PartOne();
        main.calibrate();
    }

    private void calibrate() {
        List<String> lines = Arrays.stream(getInput().split("\n")).toList();

        int sum = 0;

        for (String line : lines) sum += getlineNumber(line);

        System.out.println(sum);
    }

    private int getlineNumber(String line) {
        int a = 0, b = line.length() - 1;
        char aChar = 'a', bChar = 'b';
        while (a <= b) {
            if (Character.isDigit(line.charAt(a))) aChar = line.charAt(a);

            if (Character.isDigit(line.charAt(b))) bChar = line.charAt(b);

            if (!(Character.isDigit(aChar))) a++;

            if (!(Character.isDigit(bChar))) b--;

            if (Character.isDigit(aChar) && Character.isDigit(bChar)) break;
        }
        return Integer.parseInt("" + aChar + bChar);
    }

    private String getInput() {
        return """
                gsjgklneight6zqfz
                7one718onegfqtdbtxfcmd
                xvtfhkm8c9
                914two8
                vxzzvdhfqfsix83c1ttvbbstxgdrkfcnmm3
                76mkvhmbkpm
                8sixssmlzlhrnineggmrvg6
                threeninedtr7219
                two2geight
                3nine9fivetwo9twohxhc8
                llbfmnzzntdcfbslcl3xxvz
                two3leighttvpkfmjhhonefour
                1b9four
                fivefdlqonesj2six
                hfptgztwosix8
                fourkcxqfgxbsvjj3472
                xhzs7rdphtxhtwo
                eightthree51
                3nmronemlqzfxgonepkh
                9vnxqtjjrsg
                533fivesixrvqfxjrdhl
                bkrljtkjb42fqnp
                4mrh734
                threefourfive83l
                lcjftnpqfourfivesixtwof3
                sevennineh7two3
                onecgrmb74ctxhg
                kmvtdrxvrfivethree2
                seven98mflv
                tmoneightzstdjqjncnkpkknzoneonethreefive7
                fourzsqjbffmxf6lsqdttjfive1nine
                ccs3onesgmmrb
                kflkpscthreehjjgckfrfdhc3krgntwofour
                7five2134
                pnfbrjhgprdsvzjrklrclmlgkk69four4
                cheightwofourxt2
                1167threetfqstpkc
                6dsk2bhqmonejggkpvffhgnrbsix
                five9threefour
                one3136four
                vvncdsg6jnxlbsb3
                fgftp5
                xxscpztpxteightv4mprlzmdhxtxmpvgfour
                g4
                eightmbqbrxjbdx5
                8nineeighttwo6lcsvmvxdqbgpdbtjnnine
                jkj86threeskgpnl3four
                rtmpn5cbtthreefgxnhhvlkxcbtknnine
                7dpn6cqstqrv7sbgzxhgrqrgn
                3fivetxgjgndz1
                tfmkd8three2
                rcl55cvnfour9twofive
                dmgdbkfjvsnpctj69four5
                xjlrvznbgl78eight
                dmhkvgbc6four6eightwofkk
                zlhzn898scffour
                bdeighttxntvnslbf1nine59
                htjltzmzeight5foureightdvv
                45fourl2
                seventhree39fivesixtwokchzgc
                fxtbgsxch1lmdsldthreefour8rkxjz9
                five3five8
                threefvfcxnfgskqjdjknrgkvnkl6
                8jzdkxm
                plttwo2fourseven99zthrklvcvp
                gxjfdnzrcj2847eightnine
                2onetwoxdc
                35zlpzpvfn77
                nxppmskvrd1one89eightfive
                glhp52f
                mpptktkhrbbcsdheighteightqkjgckvxs6fourseven
                1ninelspvpm
                threefqn551
                eight95lhxrtwoh2hbnd
                jlbclhxp72fivektxfxbtwonetxl
                one7nflzdbdjchbbqqmn
                fivesbgsrvzrhz2ncbkhsbrgnpbkgcsrln1zksfqkcxpf
                1ftfour22hvdcqrseven
                sevenjgrkpbxxnnv1nine6hzkrzzfl
                fourthreefour98sevenbthreesix
                sixgrrjkl3gdzz86onejpjlbpnthree
                vhx3tnzcjvgg
                six3one4sixeighttwosbkqdjfhfroneights
                669eighteight32seven
                jdpzkdnngc6bvqvtxtxfivesixthreedndsqmv
                9eight6ssxcdt6fivedsnine
                nine3onetjmdqpktwo
                ninejjzrklhptsdzbt6tmxnpbrm
                eightsevensixtxvxlqtdjfivebnvpdhvfsqbbssfkplzmkvvxh7
                xmeightone5cjgn1nhjsthree5
                xncbclzqqgskthree14bptlrknkmpntxmnf
                sevenfour8
                34
                5ccslrvbfive
                sixsixlqf72
                kknmskkfivezcmjrgfgclgrz1
                gqxtmrsqxfour12vlonefive
                four8594kxsc
                364
                hrbfxdpfivesevenjcjdm3nine9sixsh
                mml5five
                btcqdx7jjsix
                4558seven4mjzsix
                1mfckqcfk
                4pjtbd18ghnnjqmjm6cvcdgjlcrmxpnnts
                eight6hd
                cdjdhpjccncpmrfour9qxlqfivenxjfssftnq
                5bchcbpjxnsbkxgbqgbr
                sixlhnzzmkbfourhzp58onetwoseven
                kfgkqfivek3br
                fnklssmgnine4eight
                rbbnjvgpkgbs65sevenmeightsevennine
                8ninenzgpldnfgjjmbqpmqvgqcthree5seven2
                seven6pdrgrldhtldhmndbjpj
                5three4zmjpslhh
                threesixsix45
                szxnvzrkseven2tctf
                xqzpninesixseven5dndlqd7
                three6ghhzcvpkfivervsgplxq
                eighttwoeightlfntmxptgk2pngplvr39
                33ninenine4fivejseven6
                fivehxbmjvxxrzrqr29npqhhlsjr2ttmnl
                slmltqplzl73dxkxrpgn
                lxg4371three
                tjxsmjnthreefive5fivemshrhhj
                5eighttwo
                sixbpqtcrjzmveighteightjzgktzss1
                1qxjz57sixzh
                4djpqz54122
                threeclg1ng7kgprvd
                3143threenine71
                kcxmcthreesixeight23
                4zhvn4five
                lmxfone47fbdsixjgl
                kzcdzp2
                27twozjbtr
                gpvkqdpbpzthreeone5
                bqvneightseven8qll
                seven8brjrp272none
                3kxhglddkjklkl
                5sevennine52nine
                3fourgznkfpfsxzsnmoneqsixtsm
                twothreemkz6ttrtbj8
                qoneight28fourninempvltzrtzgvfdcdlxv
                rllmkpvgqnkdgdrseven2five3
                7eight89fourlkfourfivejkqgffz
                four6xr
                6sixfive2hhzdkskxnine3nine
                two6qmmkhb9eight
                cqfxnmrlnhcsdqqxkn2nsncgvdxgmnineeight
                7sixsdsfour4mrxeight
                44threetcmtzmxzgjonesixnine8seven
                dlonethreejh6bgxxmlkdseightwokp
                four3lspkhhtsmone
                89hjtnrrpvfzjdkzp
                xc4sixvzpccdblczvleight7
                2twotwogzqhp9vnbp
                rxsplmvb1two8pdtnxtbthreefiveeight
                bsfdmnnj8eight
                rntszdckhhcmqn21ljzqbhn
                nineeight8
                1fhmnzzlfjpdp3ptj8threejqvmstbtp
                267
                hkknsfivecrhthvbhhqj1
                six6xcqpnj9fivezcqbrfour4
                8one2gfsgg
                mszrrqmr4nine9
                5fournine43three
                5one9hvvrthreethreef3
                ninetwo6twofivefivennhjqkhzntkqptfxvdj
                9onetwo5fiveeightnine8
                nineseventslmmgnsjbdgsb2sixlmvxpdg6
                8nineonethreehghh
                jd1kr
                drrsxljl4
                fqhfjdxdlsgjgkhcpjkqpgzjgchsixrvzqn7
                7one2qsnxhfqkseven6
                1vhljtwo1oneightqm
                gl3
                two2eight1threethree
                64nine
                qglkhnfffsnine2three566three
                7sixtwo6trbbklgjteighttwo
                nkccpeight4sevensevenone
                eight9ldkvgqhq3
                ttkqpxpzrxph1zfzhbvbgvn
                46lqxxgrmvsix
                twosixcqsmjsthree8pqthmd
                ninesixdsns66lvnkhrq3
                seven413crqjpkfqleightlgxgck
                onesxztkrtxksqklpqcmrlpjlnst6ftwo
                jzb1oneightqqr
                ninexrmlglbdlfqm4twolnlq
                4seven4eightzds
                fourngdzkklkxtsix8
                cggtwonebtkxtwothree16seven
                three59threesix
                3qfglrfcr4nine
                9seveneighttwofoureightvvhpgmpnftwo
                seven2sixvsmxv86
                mgvqr5two
                lggjffzt2six7vxflh23
                hctpninesevenoneonevr3
                7threeqzgzm532mn5
                vltdnjhxgl6rjbmcb79s69eight
                snkbpcgclpbflxbz6nkktqqgplm11bdnvpfour
                75dllnlkthree93onedflbbmlvmd
                sixthree94frdpkdccqkxv5
                hdpsvxl2bszdpgspqgxrzz3
                hztwonethreeeightzjqk8fivepvgrpsrxxsbfqfv
                kfmh6sixv74two
                one9three5
                lcn2hls3three66gsfmzvlx
                tmlhhl72nhhkppscc
                eightsevenprzgonethree7nine1
                1rngfnx78196sixrjbbkzp
                6seven2182six
                fpsl5xbdnjbzonethreezcfqmqonefive
                5cxhrqzsfz34xdkvtxblkhvstcmjc
                seven36ccqzfmmlvsevennine
                5nrvq2nine2
                fljzxvninetqxjjcrsvp7
                1ninetwosevenvdtn4qcxnblgx2two
                dcfxp2onefourfive
                6czxzpsc
                threeone1grvz8pvzvzkdzjfsix
                hmbpnqntczjhdlsjonedr9prxvkt6one9
                dccns9threeninexgflfjltmvlssrhkbvktcfourg
                sevenhbflnmglrn4rtseventwo55
                threehddkrvsp11
                6threegtk5five
                29m5
                nine3threesixsevennineddgchfiveeightwovqq
                2jtgvrldnbpfncfxtq
                eighttwo6vtgkvpqzthree
                5sixseven
                twohj3seven3fourblqqbphcbfive
                6one7twovjfqlsdgnrtzlzmjxgfljs
                1nv
                22five27two
                3sevenlgeighteight
                khpjmtsskfivefivexbjnkdtwogmxcxrqdpl2
                zmvpjtm6gzgztjrtnmgpsevenfive28vjvhmnr
                9four71
                9zghgdjs
                3oneqcjhsbv9threefive
                47rsggonennqmbbckcdd31three
                sevenfivesixone5eight
                48hcmlcone8x6
                three9threesixjtxhlm3eightgtrskhqfjtgfjbcfdt
                5ninefrpqjdhkkcldvhqkljpqpb1
                969nine
                ninenine8ctprmxkvnine3xkl
                seven648lpmxdn92
                rjhvlnz5two
                dlvqhfmp587
                sevensix6
                eightsix34fourlgxrndbjjx9mztwo
                czlpflntvpc1qnl2
                9seven8qsixbjoneeight
                snnjcseventwo6qst
                ndxgj756zqgt
                krczgjpbfp199three4six
                cjeightwoone8
                ffmddcrh7rrxhpnlkkdl
                nine9hhppdvfczxkjninefivecdp
                8eight19
                4fiveeightthree2twotwo
                nine2four4941seven
                fournine5twodqbkbjjmmqsn
                nzqgngfxftwo6
                5bmlfbsql2sevenjrxkkdtwoone
                jfeightwoppxbpgzdljnmmpvrckv8
                chj66fouronefourvcdd
                fourzvgbsgkmgslntrzxtxvjnmhk5v7
                1fnzftqmtj9gqkblpknq6blmlkxbzhdsdljvqfour
                116rqpdqq
                xslxqcmlchmqlzmkxbk79hnlhthreesnnmnht
                sixfive8kjhrfdxrtfour
                nlv71clmzbnine6
                42one8lz
                qspsdj2gv6vl8six5
                5gctkjzxlr2twoseventhree
                rmgmkvqeightpfmrxqmvkg8
                3sixnjrjbbzl3
                1nineseven4three7qhdsxvbmlk
                fourjbznsbgsn2pgxrzlkkjtctm3eight5
                36fourninecppsqfflbcbljnfgh2
                eight211ninegnfvhfxqcmpmeight
                vbsg73
                3ninetwoonerbzcglkmdg
                76ngkrtfonecltwovvgvgznzbmxm
                977eighteightwocp
                fxskxcdkdeight2225
                seven98rpzjxscseven3vtbbhqjrjfk
                sevenseven97jxh
                sevenfourfivexsspnqjnlxtbrfour24
                fivefive5two91six
                gg2ptrsdxtfjtzztthree8
                eight2ncmps1qsix25
                eight486zfqfmgchtrrbcrjsevenrcqtxnqnrb
                7vgn31lvqqvkdqlpddmllbn9
                1hlgrlmctseveneight9xfsfseven
                onefourdqzvlh7
                four543ninethree
                4seven1one
                79twogmjcngj7rseven3
                xxtkcbkgqfldssix4five4nine
                tqxnnspd7sevenvljzl2scsbkhqdq
                cbz3rczscjfxtzfivenbjqone
                threekkcjlmvkfrsgz6r
                1sixvppcksdvrz7
                dvngzs74eight9
                qrncqtqxkfrndcrrpjcglfonesix75seven
                eight6cksxfdthreefive2eight
                four51sixfschln6
                hblmcggzgqsix2two
                93two985
                78six6
                6sxmd289nine152
                gmpdcdcr4xzmhq3
                5threehpdmq
                eight54xcrlsv8three4
                35twofourfivenine4tjthd
                6kch9
                7fjlvptwo2ztrggpmsntwo
                7twosix6kmdnvspnqgjxcdtgrspjj7
                tsix8fivethree
                2pggbgxnft7
                sixthree69j
                24l
                cpzltvslq9nfhcv
                six46eightsixsixbblvjjkvntmm
                7five3
                six2three
                seven2xxxhhjnl53sixjtgbnvh6
                fiveeightj1mrfvzfour3p
                6foureight588zpjdcxlrshtwonine
                xvtwonesix7prcjfsxjksknxqqsmsix
                eight3fivexmrs1eightnc
                vczdhchhsmlx7zdlcgfzrcgkcnqdvdtphxqqjxnsbd
                six2fxqqdtrkgqpgjrvhxtsbqzz
                twotwofour4six
                9nzcvxthree
                kggfkpvhrronep238nine
                41seven4sevenfourvrmxkhpcmskbctwo
                nbttnvh8nlhldjstkvdxxlvqeightoneights
                tjqdkfourthree466
                twothbcvstwotwo2xpnqrldsmdtscnrp
                sevennine3
                twodhbtlnzrt418dlszqkbc78
                3four8threeonetwoneh
                drtcjpmrlnine3vgf8kssrsssgpnseven
                eight78jqjjkgtbcckdndhdvz57q
                five59onesixsevenflls
                63bbznssjjsvt4
                fqkgmcrxf6gkcninesevennfzhccqtfour9
                5nine2three
                gfkhpkfgb9four49rqcjrjkglpzxr
                ds28eight33xl
                qdgnn9ninecpcv
                2sevenrlfkzmktzgsevenzzgxfrmp
                twovpthxmxqgr94
                sk3gbmrknrmm
                7sevenrpxjvzeightsix
                9zxzqglvxqm6jphmvfsqvjjqsl
                9kqmnkthcdhtwovbrqzftst3
                eight669zvrdpv
                shgjkgthreeznz69pjltseven
                ninebc5eight
                5l
                onesix5five2clxllfour
                71three2fivecplsnlgsmthree
                twofourone6fm7four26eightwox
                7three9ftpvvbzpjzsixssxbqcfsix4
                92eightlsgrmpqtpptxrdfxthreemvlxfpsevenoneightdd
                eight7three
                drxxcghbsevenninenineljtczntp6
                nine55cpqfkdrthree3
                7fivefp3eight
                97nine1ninexprdpvqzps
                four3eightpgbdhnmqvhjjhg6frqkpqzbtwoner
                3threefivesevenrvr3sixthree
                sixs6zl184
                fourlfkxcvqkllbtz45threefivesix
                2twodvklqcqdjjdnpx84xgthree4
                eightfour8dnqmlqmxd9cmt8
                t4sixkkfhgmn83eight
                eightoneninehqddxnine75vppqhlcm
                1threesdvsszeight5dcsgrsv
                seven776smjhhb
                onevmr62dqzt7
                pqxtspl19threesevenkjvxjdhxkseven
                cgkvmx5lffclxgtsnseven
                fqjctfrrlmmnpeightone19nineqgsnsqbjk
                8twoone
                c6eightonep3gxjnsjtwo3
                sixthree36sevenseven
                5vgfsdkzbxmvxncxjpsxffcbnr62kmgmhcmkq
                nineeightfour9kvdmxg5nnhrf
                5blqszh97fhgpbdn44
                nhzbqprgptnineflxgvfkvlp453two
                kpcqvjcjcj6dfpsljlrxdlzbf8grsnsdmklp
                1zkjbnln
                four2xvxrrvs
                nine5nfmbxnrgfnine8onekqcnine
                oneonedd8
                rr44
                8bckneightnqmkvqhkkmxfour
                2pznjcxlj4onenine433
                nhmhkcqbsrrthreeeighttwo3f5
                eight64sixninefivethreecfbbdk
                csmoneight1hrsevenfivesevenone756
                9qdrxl
                26two3jq
                pnrskrrvtonesevenrmkcxcm2five8five
                sfvfr8three69three7fs
                seven52bkslnnfrbqvmblknq3f4
                zqmtdtp31threesevennine3
                9tbvvjstzmdpqnpbmrb32cbdjgtsjndjrps3ckpmspm
                5four4rvmtkppghb9
                24ftjxbdq3nine
                ltj2oneeightonesix
                76three2sevennine
                hfnzxcjfxgseven5cpph3
                2one966dpjlgfqbmceightthreenine
                5one9smzz76eight
                348tworhzvqjdmqtwo
                cjsvvksgzkktwo7hsfkrhkcsbrqcnrz26
                threethreez8
                m3335cdgbxqn5twodmcqk
                27eight4
                sfmspqbzr9eight
                rscxzq2fqlhbbhvkdbzqzqhzfourninepclrkkdrtwosix
                pxbld2twonef
                plpbbkvxqpvdxqcstp5threevljjqsqxsevenseven
                2sevensix9
                5413sxmtrdjtcmdqpbpcprsix
                tpdqxscxjldqvzncbvrpr9cvkqdffvfh8four
                six14
                nsmqttrbhrznvonecmlxtdclnbk3
                ninecgbqh6twoctsixthreefive
                hqsgonesix3oneightklm
                cxxbjptkvkcttddmtwo37one5
                v13two
                txxm84kmrpdkxhtbntkhj4four5
                jsrzgnine8nrmzpgf5sqdz
                4six9dkxttsthreedgvjkqpk
                msnrq7
                t2five4vtwo7sevenrjdrzvb
                2rxbdzlszjseven7
                gmmninesix3119ninemdnprsmd
                ninesevenpbfx6fourfivefdvhrsctztrheight
                qk3two317hnpkqxbmkb3
                oneone6sixdzdmfonefiveone
                427sixfive
                17njgbgljkpxvhph
                4hnfvpbvzxl6three
                5sixnllvrvpjpv
                3sevenfzjltglsjkdknfnmpsvfive6xdsm2
                1pxp8onesix
                xclcfthreeln9ndqhvdxknkjzv4
                6fourtwo2seven1fcd
                1eightseven4
                four21eightlfjzb
                nine9ninenine81
                eight8zpfsshlqbdlfourmch5four
                6sixjdmjjgmsk
                ninesix8threetwoxtqdsffxlk6
                dgsddfcnnc3sevenseven532one
                lsevennineninefive851dtqzv
                nmrxfsmfcscftvzzbggglsfour6
                threesmxqlgmpvtwokvrx361eight
                brbkgqcblcxghjp34bpnrctz
                sixbzxfbfsjth14pqpvjqfmr
                oneseven99
                7four6562zjjxxjlvfdqbssmcx
                8fjssqgzthree4five3
                fourckmtsssqgdgcvmqhcqlcqqdhv5eight
                bphtzndpdrfivefour8nine5
                ninesix57jvjtwo36vzljdfnndv
                eightfourfivesixone2vg
                5sevenkdgcmjthdxpxprcdnzpffsixcjmh2
                9cvldprttjk1
                seven6fivesfjjshfqmsjvfpc
                eightsixstmhlldl21fourvgsmdlcd1
                5nv1two
                tsqxlfnd6rtcvcv5
                eight3zdljlvkbp7hfive5xzgzspsnfour
                945sevennrtnn57
                562
                3vtnlsfoursjbgbqmlx6
                8lprsrtvrh9two3
                pssfncbhqpfour1dgcjqpccfzfntphmtjthree1sixfour
                rchfmfp18998rsbx
                nineonedmlffz5
                seven2sevenonetwo
                nine3gxttrkkzpj933mjzhphl
                cdpqqhrcrrnspsr378two
                fourrprdlkvqj8tntfttwofivesevenqmcsgpljvnl
                978sixskr2gkrcgn
                jcvldmcdqbjdcxhjcgngsevenfive2cfcmbb4
                szlsvrzzkseventwoone6ninesevensj
                gzboneightmsblxgzmsq5seven
                seven5eight5
                tsblj5onebkx882
                7kdgdfvx3sevenczgf
                94g14onenine
                7fournrkdxz4threethree
                8eightqtworlcxtv4
                rbkbdsqbfour39eighteightwoxn
                cxgmxtoneninennqtmzml6dq
                8fivefour9
                8bhspzfsjr9
                fivekzgvvfour8sevensix4vlphpblsp
                six63kbbxrfivefive5
                eight5gmkrhrkjjxhb
                xtcfivepntwoeight9seven
                6nine8fivenine2mf
                5fourbthreenineslxfgtqrxcv5four
                4vhkxmlsvfg
                scphnsbz9h6qnlhcqmgl
                tbbcqfxrllszbseventwofivethreeninef1
                zkvtlscldhngtk59
                one6fourrmftxfsvmtwo874
                37threeonefive4
                lrnnspbrgd6jzxtbninesevenngnpsljcr
                xhldmfc4five76five
                qrzfivexklqcjdnine46
                jkgb6ninesix41threeseven
                134628twozlm
                8ffrzgtbbfgfive2ninethreem
                2132
                7xf
                mfhmshvfivenfzjhslq7nfcfgvjhs8
                seven3248
                pvpdpxpg135seven9vpcpgrzlpjblmd
                shnslhthreefourtwodnpfr7seven
                6hxhhmfivesixseven
                vppgmfivethreefivesevensix2two
                hp98
                phlskgmgrjsbtq2gkjvrgsd
                kkfourthree9fhnpdqcqhtwo
                ftnvkprhvllkh9n
                71one7twofourfourqtfmc6
                eightfivehssmqsptconefive4
                ninejcfqknhcfpcbcsmnpvn4six5j
                one7jvmtxkjzfive
                twof9pqcgdfqsq4d7
                krczdrpxbhsngqdvsqb1four7mb7lldv
                seven9634tgcsplgmfivetwo
                vjvpstpbgtsevennvpsvch97rslh4onefour
                zbtgjgq23seven7lbnzdpnkzf
                zndbhclr714
                twofive3
                9eight2twojxzdkptwo
                gzqfcqpxnfhtb28dvfeight38
                rsqvgsqv9tdlvssj
                f78hjftphgcv8bqgrckgldone
                fivethreetjg2
                6vtqgdkxsmj
                xgjdndnpsevenzfl6tfgxltvcthree
                threenine82gqnffkvm
                zmlblc4fiveseven3two
                msmlvbnqbt9
                144bfcbsjztmdldveight
                chceightwofivemcfrxv266
                two9f7gzhhsf6
                ninetwoffour8sevenjngv
                foureight22g7twoonemlvq
                one78ptfgbbvx
                fx5
                5rvz2two
                913
                9eightnkvhcksoneqsqgntfthdtjm
                one1sixcsccdvbxzx
                sevenoneninethree4one7seven2
                jqseightwockmxjd3gfmlhbn6seven7sevenkhcr
                sevenqqhs4onemcn
                fourseven3nine7pcn
                sjjpsthkdfeightcsvlcvhltv6
                qpc16five
                3jplhrj2threetwofpvrthree
                4sixsix9two
                one1eighteight
                5tg
                256five9
                seven9crnff9eighteight
                16five1one4kqllsltrtn
                eight3three
                seventwoqtlxj8
                74seven5
                2five7mmgsbfc
                five7four
                bmtkcxvcj997eight
                cpgrpgxtgkqr9
                sevenmdqtqhfvnknine929xm
                nsix27vzglsevenseven63
                six1nqpsgtrllsnhmbnqxrdvrcx8s
                eighttwoflrvzfq262
                twosxtf866hfhxn4fourone
                3fourzbrtmd47three
                four99eightbcldqfvrm
                871
                2twobdtnzzqgvfggjntvgpnqslbdctppnfzpfpcbvzqccq
                sdmkzhb8lnpjntj7
                threembr1
                5fd1sevenpsdpdlnb16
                7mnkkvpzrrnslfksrninexmpnfpbzhkx
                nfrnvtt8
                24dsffiveqzmjrjznfksrknrfn
                5foureight3pn3
                nine9three
                nine74cmxrdvcxf3pdhbfour
                frjnzrsixone53eight
                four41fourhfjnjhpkzp
                939rdjhlfpjsix
                4kdkcq9two
                329fivefive98
                65485
                dfsevensixmdbfour7jhxsfourfour
                rqtwonerdkf3eight6fourfour
                twoqnfthree5fx
                rtwone1two89ntwo9
                sixskqssbccfour7fivevcmsevendqbfcvks
                sgtwovmzmzm9
                vk9
                seventhree4
                48mv3eightnine
                six7gxnj4six3
                twotwosixlm55dmzdrntzthreeseven
                fivemhcdlm8fivemkffllv9
                fkxzdh69twoonesbrfhntk
                zfourthreeseven1kllk
                6ninethreefiveqdct
                nineeight136three5nxvj
                fivecpbkhqxpmf46twotxtfrhmvboneone
                brrfqninetwohgqnkfctkseven1
                npblhpcpfivehdsnine34
                vksix4fourvrbfmjcrhb78
                72xfmds46threefive
                five1kq8eight56three
                3sevenfvcsglnjtbhdkqf
                6tr6qxqrmstqg
                15five5
                fthfvffour85
                seven81fouronefive
                dhkknlbfjrnsfcvvkk9seveneightwos
                2lngrlvrk4shgktcbpfonefivenine2
                sevenhhlrfqmzn2
                6seven927gdczblhjlmrxnjqfktwoneq
                7phbj9fourvbx31seven6
                146
                jnqxslzpsxdftrqczq764
                tmbjdldtwogfvxhnvsfp8tzzp
                fourgv68bblxfktsfdg98
                36tnrmd2jrllk2npbrctjcjthm
                mx3nine3hkslkb5
                xvmgtlzmrfjcmqgtworc3
                vxscrns1lclnxtwo
                foursevenone534
                jdmrj1sixkzdxn
                two9threenine
                2sevendsmlzh13jlslmvtnine
                nine8nine
                gthbsq953kxckzppcxqzl3
                xnrgzjzrbp5rptrpbsdgsqfeight5
                1sevendnmxkpdsrmrfkpmxcq22sixmdmvqlgpnbcxf
                eight658x14fq
                rzvgmdltnz9nvthrjvpzqf
                9oneightgl
                dsbtb88
                three4fourninelzvqhvjpk6
                seven59fourthreed
                3671
                66nineeight8two
                eightlszxlsxlcq3sixskqhj4gkblpj
                three2eighttwothree
                nine853qttjrjptxttwortkhmjss
                twosix35
                5948lspjxzpbmthfive
                fourthree8
                fourfivevbbqpppqrkkzjqqbnine3
                8nine4xszllqzzonesix2nine
                crgnbqrfourrzjbpnnsqthreethreefbnine85
                dx79xjkcpxsndsrbnjlbnine2
                9nine89
                one7qmv1
                dlpbzxfm536392fp
                3seventhree8eighttwoeightfive
                twongjrfkcb66
                2eightseven8
                zffrln57eighttbqsgzbzhrzxt5kxxlcxb
                one5three621ninetwonnprsbmm
                3vmslzzp8xcpcgvf
                threesix93
                seven3sixfnbbbeighttwo1fivezglzb
                kgk7
                48seven2ccztcfnv5tzkrxffour
                xczvzdjthreeeight6hnffivexxtmqs79
                three4nine36threehjp
                nineqtdtmmpjpkzpxmmfive83sevenseventhree
                22jfdpndrcvxbgz
                7bljfctkbpc
                4bfblqrphseven
                fklxmcqxthmnvrlc9
                4seven9zspgftgvd53dsdkhgbns46
                7seven664fdqkcqtr9
                dvxtkqfqbhrllbone3six3
                4ktplgtgzlf3eightfxslssr
                six2bhsjknjmgdddgnb6tbhvxbf29nine
                two93twofngr8four
                oneoneftmqvblcrjnng7jvch97one
                9fivexmzstmlrmztwohsqmzfivehseven
                5two2hggzchnn
                one28ptdlfourgnrjftqd4vxfdrfx7
                six6zvkcszt4tfpkeightvdkjzbb
                7oneftjp
                1sevenseven9fsp
                jqtznvrq8one11fivesix
                3ninedkqxtmoneighthkt
                8k
                931
                clhvprlljttm9
                four14bfgf4eightwoc
                xrflnnfb2rlv7twoseven2six
                6366hlgklvjvxxlbkxgb
                nbkxvp3eightgnznqqjbt5seven
                98sntdts
                cneightwotdkfxxxjfdpz3zkkthree
                five1sfhq1lhhvjb
                zdd56tcdchkvnbn
                sevenhtpbmbntfivethree9scjfivenine
                2spxggcvsvm4msdszqtml
                4twoxsevencjgnine
                89eightonetwo3ghqbckqkn
                fvsgljnzgzfive1slhbxxhsrlmfivexqnkmtnzx
                1g1
                94mcreight
                threefntlsvvfnine9
                b3hnhvjhtrrv
                11fourthree46
                plhclxcjrsgspx3b8fivecbx
                mvjxqnqxtwo89bfive
                three9nkjrh6two3
                dgprgjdgcrtqxgvknnk9six
                dmbljtqg66zxjr95nine2seven
                vdxoneight6
                22two9
                7oneppgrjnmrvchvsznsgfivexxdt7
                1three4mzc
                bdnhvtsjmdnklsxbtmnztqjtpnz6fivesevenfourzddgsrfmlq
                krzm2twotwo65sixfhpplvcgcs
                qzcvbvsfive1oneqzc9threesevenseven
                threesixninekghkvvzd4
                txqjpmlvdlpm7
                eightsix1l96xrljgg
                two63d32six
                8nine1fivesixfive3eightwos
                sixninenkrpsix2nf4
                four2seven35four9threensbv
                ncjhcskrx6
                3eightcpssngjlsqvmsxqqpldhsxsthreelzgzn
                6zjnmxrgcz
                9bbvkvnbmzshtdzxgqnqmqtthree
                four2kqmzfgvpk35rhmqhtrqmfourhjxxfour
                9eightfivefrpqtzmkkgkvjbbqmsqvq
                eightsevenzpskfbrmcgzjjpnlgr51bdlcmsxhf
                pt8two6seveneightjsqxjmlf4six
                phjclrmpzm1292gdfivenine
                sixfourtwo1
                9tvcnzknine2rdnqfive81
                sixtwopvxjcnmone2kxzxgmn
                twosixpcntbtfivenine4two
                rxdgeightone86twobzmnlgkdc
                4two1twovtldl8one
                fiveb1
                212three6twofour84
                74tstlfmrmcj
                sixgxtwotmrmzkfsj9
                eighthksxmf144xltwo8
                mthjxjhnqxnhcbxg783
                prptwonehhdlrd71threeone
                59fivefnsmzfsix
                ninesixonetwo9six6jtptone
                eight9ninefivezqvpstsevenjvcjmdcscnzlqsfnhnrnmn
                2ckgjml4rcprzj7tp6
                sevenfivesevennhg136
                ninesevenvhl5
                fzflrseven1five5seven
                seven5lcfxp
                bqhjg4three3
                three8ninegtonetwo46
                cvdpr8
                32fivehfsdhxgjnn
                sdndcpccpvdzdgn9fourlnslcmbtwojphzpnvrnp
                9cqkgdf7fxgdfcllvnnmzpptninesixone9
                3chllzcgq5fivebffm9
                sqmtj4qlhlcrmrnb38v4dsix
                sevennine84bcpvqjcrxpvtcgfhlfhncplktf
                qkzxvstdgnfour4two
                jkhoneonesixfiveone14lvzn
                threethreefivensvlbfour2four
                vgqlhqfrlfourlzcgppdbhq57
                bqzpzbtwolprtwo9
                lfjs9six1five2fzcldvnpxtmhsix
                kslcntz36nine
                nineseven8rzccgfhzsjnjveighttwo
                three3fourfivedmjlgqfhmninemst8
                4qxvzgfvctwo73
                75961fivefourzg
                spcbt66sevennine4four
                hhb1
                dtmoneight9
                3mbctjhfmr2fourthreeseven86
                sixjsbmvzql6gfnttq
                1vknfgmznmnzpgvsp3bsksdsevenfourrk
                six4six7ninepfxjsshthree
                4rqgzpnqcg8skfgksjone3four8
                seven5zkljftwo
                76sctscqtsfcninefourrgmsbsxv9six
                46fpdqhkfjzgtclfchbbsjcbjhsbkqggzhlb6four
                bshbvfourzc79lvvdsqjksmzmqpbvrsrbtg7
                jdqmtfeight59fourtwo
                ninefivejsl3
                94z7fouroneeight
                5nbmvgheightfive
                sixseven5one9ngk3
                eight3jddmgqnzcfjsvrd6five6kmbxss
                seveneight9fourthree
                eight83
                3spltxvtbg
                92shzldthreefpckdtqhm7fivezzkdlz
                6two9threeztrzxphhksqc
                ninedlone3
                eight4nineonefournsmdgkdszt
                9cpxhnksktwo15fivefkq
                144eight77
                1sixjscflltdrgclmgrszdfive7lc
                ttmfsx9dzgcqjzlzhvlfqrsj4six
                846
                fiveseven7
                kqtwone2ninefour7fghmntkn
                8r8one
                5nnzqqgxl4gbgnzntfrhqzeight
                onevpkxvrone8
                79klfd
                gzrjvck1sixqnfdjxfive9eightcmhmsjpl
                nszqhdfsixsixb3threenfiveqskccbffd
                srbn928eight
                eight2eightfivekmnjkndgrhjdpvxk3
                9four11oneeight
                seven6fivezzktmsixv
                fivebvtnzr4threeonetld68
                mgbfjcjbqctt71fgdbmmqdlhpxnpmvx
                rjprxbxrfk233
                nxbjxbcvvskeightfiveglpnhbzz27four
                kstwo2
                2btbzfournbfcxnvlvcbsjmplnprcrg
                mkk6three271
                tfncrvlnfdmntdrmjqqtknsgpq671onethree
                eight8twofivex
                phreightfive81hftbkbdnztt
                onetbhqqlcbqrlfzrqbtbl9ntcgvxr1rhgrspqkgklz
                gckbonekhzcjhdb5
                twothree1lfivetwolpdxhn8
                threebqmxgpjfbzrrrrgdt8
                threejvlpxpfm9four4threeone
                five68onesevennineone9two
                mjqjrqmeight73
                fvfgrdppszgdhmninenineone7759
                lrhchsonek3twobblvn9bdmcbt
                mdcqxbz84five6ninetwonergj
                eightnine548ttfiveeight7
                74mfftzxhkl4
                seven5mdmrxlp
                ptb76ndfpbtljpkhjthdfmsdddjssm
                7vkeight
                bzzpvht5fourthreeseven8
                rztztsix12nine
                fvpqdnphtd1mmrhppbd2
                h8dpbvs2tjlqgfxhhbeight
                51one
                two86
                sixnine7sixseventwo34
                two45xjcpcnhgbsb1five7
                qqkzvpsixfivepfzdhtl92six4rhp
                two6vqtxvxrvzpz
                1qqsfrgdbsm8five
                threeeightsix36xvtm
                nine5eightczhsix3twoprztckvb
                pxrsgpszonepdjvxcblqzkr61seven11
                5sevenonesevensix4six1dvhrx
                cdxnbseven9qsevenvbv4
                sixlgjt3
                dhpxhpbkq3lc6rkjlpdz4five5pctfzsplrf
                1kmsmgjpmkqfckr
                sixeight1k44
                52qdfp1b8
                86fourthree42
                six2fourpjtsvskrxtmgxnj2one3dn
                rjtfqxvfm88seventhreeeighttwo
                fivepgfvxcds64sevenhg
                glvhcrgbtphxfsfourthreerqhjxpzone5gh
                1sevenone34
                689five9ninetwotwo4
                6two92sixjb1cbhmrq
                fiverrvllhbgcsskh2
                foureight6fhtx1five8eight
                pqvvjkhtxkxcjkrf9mn
                threefive2hs6one6jhkbdh
                twoninefzflrqqzvp2xnr8
                one51
                7bjpnfsgpszrfk5fourthreebvvn
                six74
                twozcgbrrhxcpznx9dlcgdchpndcdc
                nines566
                one72zshxlsix
                vseven4fouronenine6
                7four1nine2threekzjbs4
                onecq3four
                twodcrx8
                four35sjjhpfftzsixfqctsfonefiveseven
                sxqnssjtwothree2
                8fdpjrztwoseventwo5rmqvoneeight
                pjlbnl3rg3shchseven
                zdcrnpddv2
                eight2foureighttgjcxtf2
                ghhxlxqttvonerh96715twonectr
                9hmfxxrsdbsixbtwo7sevensix
                32ghjqjfp7three4one
                197
                twon8five2
                vtwobrlhqsq1twothreesixthree
                xbdxninefour8seven
                five39
                621eightsix
                21fvdd11tsdzhjspzld4
                7seventwoeightfpnkhxmvc
                96sjrcvzxsevenfqt4seven9
                xzxmtsrhbfivenineninerxgcrx9one
                5pzgmrgrg2kdgl9one
                lqzmttxcpp7cnfstnhtglzhssntjmsixseven6six
                two711
                6onevjnvmkkx
                eight7dbmznvztwo
                9mlpltkt3
                7ninenine4tpjbsbtsgzttlgrtnfvr91four
                foursevenq7
                six1sgtbsmgft9
                nineone28fourjtwo8
                76threebgqvh6lfbkdmfvcthreeone3
                13cvtpqnmbv
                1sevenzjhtfpbfb73rccvtnmtthree7
                4xhvshhtmxx7sevenf9
                8one1
                931fivetmdmsrrmfxrplkfvfourthreeeight
                qzbthffhlg2
                one4eight33
                qfjqt9jlcthreeqkfdpfiveeight8scfnlj
                fvczqbtsix2bxkgsnsix5nine7
                9qxnvlnine2phnlqzninefive
                tszjsxbsixtwoeight62ffjtdnxxtwofive
                one2skxg
                five5onexzgzkjvtqrfourfive
                twozsxzqtrqbxqqqsbcvfpgdcdpttwo1six
                8mqkgptxsixhqmbqshcl
                lsdlsxrhdqthreesix2sevenchjxvmsjpvrnpcblgmsix
                gngrfrhbxhqkxs5fourr8three4
                jlzszzz9one
                twozrbjkjpzseventwonine8dbmfdjcb
                3nine36ppqone4czxvkxjzv
                ld6eightseven6twosix
                1jnbfive
                7threeglmcdhpvq4723fivethree
                seven148oneightd
                sevensevenseven6sixtwosix21
                8twojhdkdrcqgmclqlldv6sevenonedjthcz
                ninesevenggsjbpt5ttlrq
                59sixfivefive
                eight9bsmcgkseventhree66qmgpkkxnpm
                fourthree73fiveseven
                9five9six8threet
                3eight44
                dlcbjflsix5ttvjdxzzeightcffrtfjcjpxtwostrdc
                fiveone645fivellfcmqqmnine
                hxdtshfive115tfvrzqhgftwojtjrcshgtq
                6nqrfrhv17jdxpfmmdt4five
                sevenxtpjxnrr1
                krzkthreegjnqrfbsdrkqptd33rsvrzvvffqhreight
                472ggfive56hgnvz
                12tkpchqtnine
                vdbsctv6eightth82
                fivetngxlttf4
                5nss
                5onesixsevenphxtmlqhzfcjxrknpv
                gldsixrhss186seven6
                gnpksz4
                4919
                pbc19
                """;
    }


}
