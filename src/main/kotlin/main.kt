import club.minnced.discord.webhook.WebhookClient
import java.lang.Thread.*
import kotlin.system.exitProcess

const val hook: String = ""

var client: WebhookClient = WebhookClient.withUrl(hook)

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Help")
        return
    }


    client.run {

        for (str in args) {
            send(str)
        }

        sleep(2000)
    }

    exitProcess(1)
}

