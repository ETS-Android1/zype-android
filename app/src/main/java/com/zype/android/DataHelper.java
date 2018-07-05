package com.zype.android;

import com.google.gson.Gson;
import com.zype.android.Db.Entity.Video;
import com.zype.android.webapi.model.video.VideoData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeny Cherkasov on 05.07.2018
 */
public class DataHelper {
    public static Video videoDataToVideoEntity(VideoData videoData) {
        Video entity = new Video();
        entity.id = videoData.getId();
        entity.active = videoData.isActive() ? 1 : 0;
        entity.category = new Gson().toJson(videoData.getCategories());
        entity.country = videoData.getCountry();
        entity.createdAt = videoData.getCreatedAt();
        entity.crunchyrollId = videoData.getCrunchyrollId();
        entity.description = (videoData.getDescription() == null) ? "" : videoData.getDescription();
        entity.discoveryUrl = videoData.getDiscoveryUrl();
        entity.duration = videoData.getDuration();
        entity.episode = String.valueOf(videoData.getEpisode());
        entity.expireAt = videoData.getExpireAt();
        entity.featured = String.valueOf(videoData.isFeatured() ? 1 : 0);
        entity.foreignId = videoData.getForeignId();
        entity.huluId = videoData.getHuluId();
        entity.isZypeLive = videoData.isZypeLive ? 1 : 0;
        entity.keywords = new Gson().toJson(videoData.getKeywords());
        entity.matureContent = String.valueOf(videoData.isMatureContent() ? 1 : 0);
        entity.onAir = videoData.isOnAir() ? 1 : 0;
        entity.publishedAt = videoData.getPublishedAt();
        entity.purchaseRequired = String.valueOf(videoData.isPurchaseRequired() ? 1 : 0);
        entity.rating = String.valueOf(videoData.getRating());
        entity.relatedPlaylistIds = new Gson().toJson(videoData.getRelatedPlaylistIds());
        entity.requestCount = String.valueOf(videoData.getRequestCount());
        entity.season = videoData.getSeason();
        entity.segments = new Gson().toJson(videoData.getSegments());
        entity.shortDescription = videoData.getShortDescription();
        entity.siteId = videoData.getSiteId();
        entity.startAt = videoData.getStartAt();
        entity.status = videoData.getStatus();
        entity.subscriptionRequired = String.valueOf(videoData.isSubscriptionRequired() ? 1 : 0);
        entity.thumbnails = new Gson().toJson(videoData.getThumbnails());
        entity.title = videoData.getTitle();
        entity.transcoded = videoData.isTranscoded() ? 1 : 0;
        entity.updatedAt = videoData.getUpdatedAt();
        entity.videoZObject = new Gson().toJson(videoData.getVideoZobjects());
        entity.youtubeId = videoData.getYoutubeId();
        entity.zobjectIds = new Gson().toJson(videoData.getZobjectIds());
        return entity;
    }

    public static List<Video> videoDataToVideoEntity(List<VideoData> videoData) {
        List<Video> result = new ArrayList<>(videoData.size());
        for (VideoData item : videoData) {
            Video entity = videoDataToVideoEntity(item);
            result.add(entity);
        }
        return result;
    }
}
