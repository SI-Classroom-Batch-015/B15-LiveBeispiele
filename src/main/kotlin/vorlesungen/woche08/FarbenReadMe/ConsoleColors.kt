package vorlesungen.woche08.FarbenReadMe

fun main() {
    val red = "\u001B[31m"
    val reset = "\u001B[0m"
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    val blue = "\u001B[34m"
    val magenta = "\u001B[35m"
    val cyan = "\u001B[36m"
    val bold = "\u001B[1m"
    val underline = "\u001B[4m"
    val backgroundYellow = "\u001B[43m"

    println("${red}Roter Text")
    println("Ist dieser Text wieder weiß?")
    println("${reset}Dieser Text ist nicht mehr rot...")
    println("${green} Dieser Text ist gruen... ${reset}")
    println("${underline}wieder weiss${reset}")


    for (i in 30..97){
        if (i in 38..89){
            continue
        } else {
            print("\u001b[${i}m i ")
        }

    }
    println()

    for (i in 40..99){
        if (i in 48..99){
            continue
        } else {
            print("\u001b[${i}m i ")
        }

    }
    println(reset)


    var asciArt = """
                                                                                                                                                     
                                                                                                                                             
  ,----..               ,--,                                             .--.--.                             ___                             
 /   /   \            ,--.'|         ,---,                              /  /    '.                         ,--.'|_                           
|   :     :    ,---.  |  | :       ,---.'|               ,---,         |  :  /`. /                 ,---,   |  | :,'                          
.   |  ;. /   '   ,'\ :  : '       |   | :           ,-+-. /  |        ;  |  |--`              ,-+-. /  |  :  : ' :              ,--,  ,--,  
.   ; /--`   /   /   ||  ' |       |   | |   ,---.  ,--.'|'   |        |  :  ;_         .--,  ,--.'|'   |.;__,'  /    ,--.--.    |'. \/ .`|  
;   | ;  __ .   ; ,. :'  | |     ,--.__| |  /     \|   |  ,"' |         \  \    `.    /_ ./| |   |  ,"' ||  |   |    /       \   '  \/  / ;  
|   : |.' .''   | |: :|  | :    /   ,'   | /    /  |   | /  | |          `----.   \, ' , ' : |   | /  | |:__,'| :   .--.  .-. |   \  \.' /   
.   | '_.' :'   | .; :'  : |__ .   '  /  |.    ' / |   | |  | |          __ \  \  /___/ \: | |   | |  | |  '  : |__  \__\/: . .    \  ;  ;   
'   ; : \  ||   :    ||  | '.'|'   ; |:  |'   ;   /|   | |  |/          /  /`--'  /.  \  ' | |   | |  |/   |  | '.'| ," .--.; |   / \  \  \  
'   | '/  .' \   \  / ;  :    ;|   | '/  ''   |  / |   | |--'          '--'.     /  \  ;   : |   | |--'    ;  :    ;/  /  ,.  | ./__;   ;  \ 
|   :    /    `----'  |  ,   / |   :    :||   :    |   |/                `--'---'    \  \  ; |   |/        |  ,   /;  :   .'   \|   :/\  \ ; 
 \   \ .'              ---`-'   \   \  /   \   \  /'---'                              :  \  \'---'          ---`-' |  ,     .-./`---'  `--`  
  `---`                          `----'     `----'                                     \  ' ;                       `--`---'                 
                                                                                        `--`                                                 
    """.trimIndent()
    println(asciArt)

    var asci2 = """
   _____       _     _               _____             _             
  / ____|     | |   | |             / ____|           | |            
 | |  __  ___ | | __| | ___ _ __   | (___  _   _ _ __ | |_ __ ___  __
 | | |_ |/ _ \| |/ _` |/ _ \ '_ \   \___ \| | | | '_ \| __/ _` \ \/ /
 | |__| | (_) | | (_| |  __/ | | |  ____) | |_| | | | | || (_| |>  < 
  \_____|\___/|_|\__,_|\___|_| |_| |_____/ \__, |_| |_|\__\__,_/_/\_\
                                            __/ |                    
                                           |___/                     
    """.trimIndent()

    println(asci2)

}