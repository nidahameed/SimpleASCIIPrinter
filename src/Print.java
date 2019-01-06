import java.util.Scanner;

public class Print {
    public static void main(String[] args) {

        while(true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter one of the following objects to print it in ASCII format: flower, cat, house, tree, pencil. Enter 'stop' to exit the program");

            String myString = input.nextLine();

            if (myString.equals("flower")) {
                System.out.println("            `.-:////:.       `.--:--.`            \n" +
                        "         `-/++++++++++/-   `:++++++++++/-`        \n" +
                        "       `:+++++++++++++++- .+++++++++++++++/-`     \n" +
                        "      ./+++++++++++++++++.+++++++++++++++++++-    \n" +
                        "     /++++++++++++++++++++/+++++++++++++++++++/   \n" +
                        "     :++++++++++++++++++++/+++++++++++++++++++-   \n" +
                        "      :/++++++++++++++oossosoo++++++++++++++/.    \n" +
                        "       .-//+++++++++shdmmmmmmdhyo+++++++++/-`     \n" +
                        "  `-::///////////+sdmmmmmmmmmmmmdy++/////////::.  \n" +
                        " :+++++++++++++++odmmmmmmmmmmmmmmms/++++++++++++/`\n" +
                        ":++++++++++++++++odmmmmmmmmmmmmmmms++++++++++++++:\n" +
                        ":+++++++++++++++++sdmmmmmmmmmmmmdy+++++++++++++++-\n" +
                        ".+++++++++++++++++++shdmmmmmmdhyo+++++++++++++++/`\n" +
                        " :++++++++++++++++//++oossssoo//++++++++++++++++. \n" +
                        " `:+++++++++++++//++++++++++++++//+++++++++++++-  \n" +
                        "   -/++++++++///+++++++++++++++++:-:++++++++++-   \n" +
                        "     `--:--.`.++++++++++++++++++++. `-://++/:`    \n" +
                        "             -++++++++++++++++++++-               \n" +
                        "              :++++++++++++++++++:                \n" +
                        "               ./++++++++++++++:`                 \n" +
                        "                 `.-://///::-`                    ");
            } else if (myString.equals("cat")) {
                System.out.println("    .s+-                       -+-                \n" +
                        "    osyys:`    `````````    ./syss                \n" +
                        "    odddysssyhdddddddddddhyossdddo`               \n" +
                        "    ohyyddddddddddddddddddddddyyds-               \n" +
                        "    /ydddddddddddddddddddddddddds+-               \n" +
                        "  `yddddddddddddhhhyhhdddddddddddds               \n" +
                        "  +dddddddddddddy+ysoyddddddddddddd/              \n" +
                        " `yyyyyyyyyyyyhdyyyyydhyyyyyyyyyyyyo              \n" +
                        " -yyyyyyyyyyyyssodddy+syyyyyyyyyyyyo              \n" +
                        " -ddddddddddddddhysyydddddddddddddds              \n" +
                        " `hdddddddddddddddsdddddddddddddddd:              \n" +
                        "  /dddddddddddddddsddddddddddddddds               \n" +
                        "   :hdddddddysyddysshddysddddddddo`               \n" +
                        "    `+hdddddddhyyhddyyydddddddds-                 \n" +
                        "       ./yhdddddddddddddddhys:`                   \n" +
                        "        /dhyyyyyyyyyyyyyyyydd:                -yh/\n" +
                        "       -dddddddddddddddddddddh.              /hddo\n" +
                        "      `yddddddddddddddddddddddy             +dddh.\n" +
                        "      +dddddddddddddddddddddddd+          `sdddd/ \n" +
                        "     `hddddddddddddddddddddddddd.        -hdddh:  \n" +
                        "     +dyddddddhdddddddyddddddsdds      `oddddy-   \n" +
                        "     hdshdddddsdddddddsddddddsddd:   `+hdddh+`    \n" +
                        "    /ddshdddddsdddddddshdddddsddds--ohddddo.      \n" +
                        "   `oddshdddddsdddddddyydddddsdddd/hdddh+.        \n" +
                        "   `oddshdddddsdddddddhsdddddsdddd+yho:           \n" +
                        "    oddshdddddsdddddddhsdddddsdddd/.              \n" +
                        "  :shyyyhdddddsddddddddsdddddshdhshs/             \n" +
                        "  :++/.-ydddddsdddddddhsdddddsy+./+/-             \n" +
                        "        ydddddshddddddyydddddy                    \n" +
                        "      .ohyhddodo.....-sh+ddysdy:                  \n" +
                        "      -+/`:yo -/.    `:. /o- .-`                  ");
            } else if (myString.equals("house")) {
                System.out.println("                               .+++:---.          \n" +
                        "                      `--.`    `:::so++/          \n" +
                        "                   `.--...--.` /+++s+++:          \n" +
                        "                  `:-..:::-..--.-+++//:`          \n" +
                        "               `.--..-:::::::..-..-/:/+.          \n" +
                        "             `-:-.-::::::::::::-..--`++`          \n" +
                        "            .--..::::::::::::::::-.--.`           \n" +
                        "         `--..-::::::::::::::::::::-..-.`         \n" +
                        "        .:-.:::::::::::::::::::::::::-`:-         \n" +
                        "      `-:..::::::::::::::::::::::::::::..-.`      \n" +
                        "   `.--..-:::::::::::::::::::::::::::::::..--.    \n" +
                        "    `` .::sss+sso::............::oss+sss::` ``    \n" +
                        "       .::MMMhMMh:..........`- ::hMMhMMM::        \n" +
                        "       `::mmmymmy:..`-::::::`- ::ymmymmm::        \n" +
                        "        :/NNNNNNy:..`-::::::`- ::hNNNNNN--        \n" +
                        "        :/dddddds:..`-::::::`- ::ydddddd:-        \n" +
                        "        -:::::::::..`-.-::::`- ::::::::::.        \n" +
                        "        -:::::::::..`-::::::`- ::::::::::`        \n" +
                        "        .:::::::::..`-::::::`- ::::::::::         \n" +
                        "        `:::::::::..........`- ::::::::::         \n" +
                        "         ::::::::`+++++++++++++/.:::::::-         ");
            } else if (myString.equals("tree")) {
                System.out.println("                     `.--..`                      \n" +
                        "              ``.--.:///////-`.--.``              \n" +
                        "             `-////////////////////:.`            \n" +
                        "       ``...:////////////////////////:::::--.`    \n" +
                        "     `.//////////////////////////////////////-`   \n" +
                        "    `.////////::::-:/::-:////////:///////////-`   \n" +
                        "  `-://////////////:--://///////:://:-://///-./:` \n" +
                        " `.///////////////////////////:-://///:-----:///-`\n" +
                        "  .////////////://///////------:////////////////.`\n" +
                        " `://///////////:::::::--://////////////////////.`\n" +
                        "`-//////:-:::///////::://///////////////////////:`\n" +
                        "`.///:--:///////.:///////////////////////////////`\n" +
                        "  .---///////://:`-:::-:::///////:::::://///////-`\n" +
                        "    `////////..:/:-..-///.--::--://:.-:-://///:.` \n" +
                        "    `://///-:/:-..-.-.-/:.-:------..:///:-----``  \n" +
                        "     `.--///.-://:-...-..--....---://///////:.    \n" +
                        "        ``.--.``-////-`.---``-:-.```.--::-.`      \n" +
                        "                 `.``  `.--   `                   \n" +
                        "                        ---                       \n" +
                        "                        -.-`                      \n" +
                        "                        --.`                      \n" +
                        "                        ---`                      \n" +
                        "                       `---.                      \n" +
                        "                       `---.                      \n" +
                        "                       `..--`                     \n" +
                        "                    `..------.`                   \n" +
                        "                  `.....-.....`..`                \n" +
                        "                       `.   ``   `                ");
            } else if (myString.equals("pencil")) {
                System.out.println("                                     `.--.        \n" +
                        "                                   :shmsyhhy+`    \n" +
                        "                                 .ys/s+++++osd/   \n" +
                        "                               -hyysysoooooooom`  \n" +
                        "                              /dooshsyyysooooom`  \n" +
                        "                            /ho--:yssyhsyyyood/   \n" +
                        "                          .yy:-:ss/::/hhysydy.    \n" +
                        "                         oh/-:os/:::oy+:shhy      \n" +
                        "                       :ho::+y+:::+y+:::sh/       \n" +
                        "                     .yy/:/so/::/ys/::/h+         \n" +
                        "                    oh/::oy/::/sy////yy.          \n" +
                        "                  -yo::+y+:::oyo///sh-            \n" +
                        "                .yy/:/ss/::/ys+++od+              \n" +
                        "               oh/:/ss/::/sy++++hy`               \n" +
                        "             :ho::+y+:::+ho+++sh:                 \n" +
                        "           .ys::/yo:::/yy++++do                   \n" +
                        "         `yh/:/ss/:::+ho+++sd-                    \n" +
                        "         hsd++s/:::/yy+++od+                      \n" +
                        "         m.omhosy/oy++++yy.                       \n" +
                        "        :y.--...ymhys+od/                         \n" +
                        "        h-..----o/-:mdy`                          \n" +
                        "       -y-------:sso:.                            \n" +
                        "       h-----+ys+.                                \n" +
                        "      :s-:oys:`                                   \n" +
                        "     `mmso-                                       \n" +
                        "    -ds.                                          \n" +
                        "    :.                                            ");
            }
            else if(myString.equals("stop")) {
                break;
            }
            else {
                System.out.println("Invalid input.");
            }
        }
    }
}
