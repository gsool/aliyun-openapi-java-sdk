/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.AnalysisConfig;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.AnalysisConfig.PropertiesControl;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.AnalysisConfig.QualityControl;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.InputFile;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.Audio;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.Container;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.Video;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAnalysisJobListResponseUnmarshaller {

	public static QueryAnalysisJobListResponse unmarshall(QueryAnalysisJobListResponse queryAnalysisJobListResponse, UnmarshallerContext _ctx) {
		
		queryAnalysisJobListResponse.setRequestId(_ctx.stringValue("QueryAnalysisJobListResponse.RequestId"));

		List<String> nonExistAnalysisJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryAnalysisJobListResponse.NonExistAnalysisJobIds.Length"); i++) {
			nonExistAnalysisJobIds.add(_ctx.stringValue("QueryAnalysisJobListResponse.NonExistAnalysisJobIds["+ i +"]"));
		}
		queryAnalysisJobListResponse.setNonExistAnalysisJobIds(nonExistAnalysisJobIds);

		List<AnalysisJob> analysisJobList = new ArrayList<AnalysisJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryAnalysisJobListResponse.AnalysisJobList.Length"); i++) {
			AnalysisJob analysisJob = new AnalysisJob();
			analysisJob.setId(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].Id"));
			analysisJob.setUserData(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].UserData"));
			analysisJob.setState(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].State"));
			analysisJob.setCode(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].Code"));
			analysisJob.setMessage(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].Message"));
			analysisJob.setPercent(_ctx.longValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].Percent"));
			analysisJob.setCreationTime(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].CreationTime"));
			analysisJob.setPipelineId(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].PipelineId"));
			analysisJob.setPriority(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].Priority"));

			InputFile inputFile = new InputFile();
			inputFile.setBucket(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].InputFile.Bucket"));
			inputFile.setLocation(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].InputFile.Location"));
			inputFile.setObject(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].InputFile.Object"));
			analysisJob.setInputFile(inputFile);

			AnalysisConfig analysisConfig = new AnalysisConfig();

			QualityControl qualityControl = new QualityControl();
			qualityControl.setRateQuality(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.QualityControl.RateQuality"));
			qualityControl.setMethodStreaming(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.QualityControl.MethodStreaming"));
			analysisConfig.setQualityControl(qualityControl);

			PropertiesControl propertiesControl = new PropertiesControl();
			propertiesControl.setDeinterlace(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Deinterlace"));

			Crop crop = new Crop();
			crop.setMode(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Crop.Mode"));
			crop.setWidth(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Crop.Width"));
			crop.setHeight(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Crop.Height"));
			crop.setTop(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Crop.Top"));
			crop.setLeft(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Crop.Left"));
			propertiesControl.setCrop(crop);
			analysisConfig.setPropertiesControl(propertiesControl);
			analysisJob.setAnalysisConfig(analysisConfig);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].MNSMessageResult.ErrorCode"));
			analysisJob.setMNSMessageResult(mNSMessageResult);

			List<Template> templateList = new ArrayList<Template>();
			for (int j = 0; j < _ctx.lengthValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList.Length"); j++) {
				Template template = new Template();
				template.setId(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Id"));
				template.setName(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Name"));
				template.setState(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].State"));

				Container container = new Container();
				container.setFormat(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Container.Format"));
				template.setContainer(container);

				Video video = new Video();
				video.setCodec(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Codec"));
				video.setProfile(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Profile"));
				video.setBitrate(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Bitrate"));
				video.setCrf(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Crf"));
				video.setWidth(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Width"));
				video.setHeight(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Height"));
				video.setFps(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Fps"));
				video.setGop(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Gop"));
				video.setPreset(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Preset"));
				video.setScanMode(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.ScanMode"));
				video.setBufsize(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Bufsize"));
				video.setMaxrate(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Maxrate"));
				video.setPixFmt(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.PixFmt"));
				video.setDegrain(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Degrain"));
				video.setQscale(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Qscale"));

				BitrateBnd bitrateBnd = new BitrateBnd();
				bitrateBnd.setMax(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.BitrateBnd.Max"));
				bitrateBnd.setMin(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.BitrateBnd.Min"));
				video.setBitrateBnd(bitrateBnd);
				template.setVideo(video);

				Audio audio = new Audio();
				audio.setCodec(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Codec"));
				audio.setProfile(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Profile"));
				audio.setSamplerate(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Samplerate"));
				audio.setBitrate(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Bitrate"));
				audio.setChannels(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Channels"));
				audio.setQscale(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Qscale"));
				template.setAudio(audio);

				TransConfig transConfig = new TransConfig();
				transConfig.setTransMode(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].TransConfig.TransMode"));
				template.setTransConfig(transConfig);

				MuxConfig muxConfig = new MuxConfig();

				Segment segment = new Segment();
				segment.setDuration(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].MuxConfig.Segment.Duration"));
				muxConfig.setSegment(segment);

				Gif gif = new Gif();
				gif.setLoop(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].MuxConfig.Gif.Loop"));
				gif.setFinalDelay(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].MuxConfig.Gif.FinalDelay"));
				muxConfig.setGif(gif);
				template.setMuxConfig(muxConfig);

				templateList.add(template);
			}
			analysisJob.setTemplateList(templateList);

			analysisJobList.add(analysisJob);
		}
		queryAnalysisJobListResponse.setAnalysisJobList(analysisJobList);
	 
	 	return queryAnalysisJobListResponse;
	}
}