package com.behruzbek0430.youtube_videoview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class MainActivity : AppCompatActivity() {

    private lateinit var youtubePlayerView: YouTubePlayerView

    companion object {
        private const val VIDEO_ID = "HNPnLdKbrE0"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        youtubePlayerView = findViewById(R.id.youtubePlayerView)


        youtubePlayerView.addYouTubePlayerListener(object : YouTubePlayerListener {
            override fun onApiChange(youTubePlayer: YouTubePlayer) {}

            override fun onCurrentSecond(youTubePlayer: YouTubePlayer, second: Float) {}

            override fun onError(youTubePlayer: YouTubePlayer, error: PlayerConstants.PlayerError) {}

            override fun onPlaybackQualityChange(youTubePlayer: YouTubePlayer, playbackQuality: PlayerConstants.PlaybackQuality) {}

            override fun onPlaybackRateChange(youTubePlayer: YouTubePlayer, playbackRate: PlayerConstants.PlaybackRate) {}

            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(VIDEO_ID, 0f)
            }

            override fun onStateChange(youTubePlayer: YouTubePlayer, state: PlayerConstants.PlayerState) {}

            override fun onVideoDuration(youTubePlayer: YouTubePlayer, duration: Float) {}

            override fun onVideoId(youTubePlayer: YouTubePlayer, videoId: String) {}

            override fun onVideoLoadedFraction(youTubePlayer: YouTubePlayer, loadedFraction: Float) {}
        })

    }


}